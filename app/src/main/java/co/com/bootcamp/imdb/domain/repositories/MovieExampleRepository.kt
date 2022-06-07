package co.com.bootcamp.imdb.domain.repositories

import co.com.bootcamp.imdb.domain.models.MovieExampleModel
import kotlinx.coroutines.flow.Flow

interface MovieExampleRepository {
    fun getTopMovies() : Flow<List<MovieExampleModel>>
}