package com.vickikbt.domain.models

data class SimilarResult(
    val page: Int?,

    val movies: List<Movie>?,

    val total_pages: Int,

    val total_results: Int?
)