package co.com.bootcamp.imdb.domain.usecases

import co.com.bootcamp.imdb.domain.models.MovieListResponse

interface GetMoviesExampleUseCase {
    suspend operator fun invoke(): MovieListResponse
}