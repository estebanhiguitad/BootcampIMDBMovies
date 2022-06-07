package co.com.bootcamp.imdb.data.repositories

import co.com.bootcamp.imdb.data.source.RetrofitExampleDataSource
import co.com.bootcamp.imdb.domain.models.MovieExampleModel
import co.com.bootcamp.imdb.domain.repositories.MovieExampleRepository
import kotlinx.coroutines.flow.Flow

class MovieRemoteExampleRepository(private val dataSource : RetrofitExampleDataSource) : MovieExampleRepository {
    override fun getTopMovies(): Flow<List<MovieExampleModel>> {
        TODO("Implementar llamado al $dataSource para obtener las películas.")
    }
}