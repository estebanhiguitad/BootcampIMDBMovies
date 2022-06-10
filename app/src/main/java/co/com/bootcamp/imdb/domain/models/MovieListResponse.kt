package co.com.bootcamp.imdb.domain.models

import com.google.gson.annotations.SerializedName

data class MovieListResponse(
    @SerializedName("items")
    var moviesList: List<Movie>
)