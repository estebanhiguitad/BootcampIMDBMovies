package co.com.bootcamp.imdb.domain.usecases

import co.com.bootcamp.imdb.domain.models.MovieExampleModel
import co.com.bootcamp.imdb.domain.repositories.MovieExampleRepository
import kotlinx.coroutines.flow.Flow

class GetMovieExampleUseCase(private val repository : MovieExampleRepository) {
    fun invoke() : Flow<List<MovieExampleModel>> {
        return repository.getTopMovies()
    }
}