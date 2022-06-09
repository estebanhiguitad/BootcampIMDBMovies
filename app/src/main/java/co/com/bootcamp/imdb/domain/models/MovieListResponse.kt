package co.com.bootcamp.imdb.domain.models

import com.google.gson.annotations.SerializedName

data class MovieListResponse(
    @SerializedName("description")
    val description: String,

    @SerializedName("created_by")
    val createdBy: String,

    @SerializedName("favorite_count")
    val favoriteCount: Integer,

    @SerializedName("items")
    val moviesList: List<Movie>
)