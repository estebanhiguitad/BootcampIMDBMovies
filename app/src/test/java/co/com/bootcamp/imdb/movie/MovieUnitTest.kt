package co.com.bootcamp.imdb.movie

import co.com.bootcamp.imdb.domain.models.MovieListResponse
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Assert
import org.junit.Test
import kotlinx.coroutines.test.runTest

@OptIn(ExperimentalCoroutinesApi::class)
class MovieUnitTest {

    @Test
    fun getMoviesFromRepositoryEmpty() = runTest {
        // Arrange
        val movieRepositoryMock = MovieRepositoryMock()

        // Action
        val result = movieRepositoryMock.getTopMovies(1)

        // Assert
        Assert.assertEquals(result, MovieListResponse(listOf()))
    }
}