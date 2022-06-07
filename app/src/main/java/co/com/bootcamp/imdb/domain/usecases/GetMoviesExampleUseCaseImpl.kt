package co.com.bootcamp.imdb.domain.usecases

import co.com.bootcamp.imdb.domain.models.MovieExampleModel
import co.com.bootcamp.imdb.domain.repositories.MovieExampleRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetMoviesExampleUseCaseImpl @Inject constructor(private val repository: MovieExampleRepository) :
    GetMoviesExampleUseCase {

    override fun invoke(): Flow<List<MovieExampleModel>> {
        return repository.getTopMovies()
    }

}