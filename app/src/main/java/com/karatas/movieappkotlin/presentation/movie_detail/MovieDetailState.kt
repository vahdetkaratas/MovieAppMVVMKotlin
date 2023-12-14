package com.karatas.movieappkotlin.presentation.movie_detail

import com.karatas.movieappkotlin.domain.model.MovieDetail

data class MovieDetailState(
    val isLoading : Boolean = false,
    val movie : MovieDetail? = null,
    val error : String = ""
)