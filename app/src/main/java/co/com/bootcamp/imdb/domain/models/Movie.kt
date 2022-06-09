package co.com.bootcamp.imdb.domain.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("id")
    val id: Integer,

    //@SerializedName("poster_path")
    @SerializedName("backdrop_path")
    val imageUrl: String,

    @SerializedName("release_date")
    val date: String,

    @SerializedName("title")
    val title: String,

    @SerializedName("overview")
    val description: String
)