package com.karatas.movieappkotlin.domain.repository

import com.karatas.movieappkotlin.data.remote.dto.MovieDetailDto
import com.karatas.movieappkotlin.data.remote.dto.MoviesDto


interface MovieRepository {

    suspend fun getMovies(search : String) : MoviesDto

    suspend fun getMovieDetail(imdbId : String) : MovieDetailDto


}