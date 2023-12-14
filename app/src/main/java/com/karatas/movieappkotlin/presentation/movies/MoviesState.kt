package com.karatas.movieappkotlin.presentation.movies

import com.karatas.movieappkotlin.domain.model.Movie

data class MoviesState(
    val isLoading : Boolean = false,
    val movies : List<Movie> = emptyList(),
    val error : String = "",
    val search : String = "batman"
)