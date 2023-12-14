package com.karatas.movieappkotlin.presentation.movies

sealed class MoviesEvent {
    data class Search(val searchString :String) : MoviesEvent()

}
