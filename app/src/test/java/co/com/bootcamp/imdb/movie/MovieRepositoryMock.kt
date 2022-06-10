package co.com.bootcamp.imdb.movie

import co.com.bootcamp.imdb.domain.models.MovieListResponse
import co.com.bootcamp.imdb.domain.repositories.MovieExampleRepository
import co.com.bootcamp.imdb.movie.model.MovieTestBuilder

class MovieRepositoryMock : MovieExampleRepository {
    override suspend fun getTopMovies(listId: Int?): MovieListResponse {
        val movieTestBuilder = MovieTestBuilder()
        val movieListResponse = MovieListResponse(listOf())

        when (listId) {
            1 -> {
                movieListResponse
            }
            2 -> {
                movieTestBuilder.BuildList()
            }
            3 -> {
                movieListResponse.moviesList = listOf(
                    movieTestBuilder.withId(listId).withDate("2021-11-03").withTitle("Eternals").withDescription("The Eternals are a team of ancient aliens who have been living on Earth in se").withImageUrl("/c6H7Z4u73ir3cIoCteuhJh7UCAR.jpg").Build(),
                    movieTestBuilder.withId(listId).withDate("2021-09-01").withTitle("Shang-Chi and the Legend of the Ten Rings").withDescription("Shang-Chi must confront the past he thought he left behind when he is drawn into the web of the mysterious Ten Rings organization.").withImageUrl("/zxWAv1A34kdYslBi4ekMDtgIGUt.jpg").Build(),
                    movieTestBuilder.withId(listId).withDate("2012-01-20").withTitle("").withDescription("").withImageUrl("").Build(),
                    movieTestBuilder.withId(listId).withDate("2012-01-20").withTitle("").withDescription("").withImageUrl("").Build(),
                    movieTestBuilder.withId(listId).withDate("2012-01-20").withTitle("").withDescription("").withImageUrl("").Build()
                )
            }
        }
        return movieListResponse
    }
}