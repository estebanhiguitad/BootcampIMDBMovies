package co.com.bootcamp.imdb.domain.repositories

import co.com.bootcamp.imdb.domain.models.MovieListResponse

interface MovieExampleRepository {
    suspend fun getTopMovies() : MovieListResponse
}