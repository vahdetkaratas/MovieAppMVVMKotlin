package com.karatas.movieappkotlin.data.repository

import com.karatas.movieappkotlin.data.remote.MovieAPI
import com.karatas.movieappkotlin.data.remote.dto.MovieDetailDto
import com.karatas.movieappkotlin.data.remote.dto.MoviesDto
import com.karatas.movieappkotlin.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(private val api : MovieAPI) : MovieRepository {
    override suspend fun getMovies(search: String): MoviesDto {
        return api.getMovies(searchString = search)
    }
    override suspend fun getMovieDetail(imdbId: String): MovieDetailDto {
        return api.getMovieDetail(imdbId = imdbId)
    }
}

