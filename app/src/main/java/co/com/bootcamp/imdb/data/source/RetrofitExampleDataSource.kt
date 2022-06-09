package co.com.bootcamp.imdb.data.source

import co.com.bootcamp.imdb.domain.models.MovieListResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RetrofitExampleDataSource {

    @GET("list/{id}")
    suspend fun getMoviesList(
        @Path("id") listId : Int?,
        @Query("api_key") apiKey: String?
    ): MovieListResponse
}