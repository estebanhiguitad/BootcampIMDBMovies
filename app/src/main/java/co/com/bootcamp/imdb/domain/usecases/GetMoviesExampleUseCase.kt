package co.com.bootcamp.imdb.domain.usecases

import co.com.bootcamp.imdb.domain.models.MovieExampleModel
import kotlinx.coroutines.flow.Flow

interface GetMoviesExampleUseCase {
    operator fun invoke(): Flow<List<MovieExampleModel>>
}