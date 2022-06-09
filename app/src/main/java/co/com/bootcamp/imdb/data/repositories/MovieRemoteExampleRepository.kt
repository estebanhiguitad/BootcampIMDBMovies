package co.com.bootcamp.imdb.data.repositories

import co.com.bootcamp.imdb.data.source.RetrofitExampleDataSourceImpl
import co.com.bootcamp.imdb.data.source.RetrofitManager
import co.com.bootcamp.imdb.domain.models.MovieListResponse
import co.com.bootcamp.imdb.domain.repositories.MovieExampleRepository
import javax.inject.Inject

class MovieRemoteExampleRepository @Inject constructor(private val dataSource: RetrofitExampleDataSourceImpl) :
    MovieExampleRepository {

    companion object {
        private const val listId: Int = 1
    }

    override suspend fun getTopMovies(): MovieListResponse {
        return dataSource.getMoviesList(listId, RetrofitManager.apiKey)
    }
}