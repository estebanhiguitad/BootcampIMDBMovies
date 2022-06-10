package co.com.bootcamp.imdb.domain.usecases

import co.com.bootcamp.imdb.domain.models.MovieListResponse
import co.com.bootcamp.imdb.domain.repositories.MovieExampleRepository
import javax.inject.Inject

class GetMoviesExampleUseCaseImpl @Inject constructor(private val repository: MovieExampleRepository) :
    GetMoviesExampleUseCase {

    override suspend fun invoke(listId: Int?): MovieListResponse {
        return repository.getTopMovies(listId)
    }
}