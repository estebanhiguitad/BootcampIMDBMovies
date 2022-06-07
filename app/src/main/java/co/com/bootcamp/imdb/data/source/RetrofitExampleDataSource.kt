package co.com.bootcamp.imdb.data.source

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

/**
 * @property api sería una implementación del cliente Http.
 */
class RetrofitExampleDataSource(private val api : Any, private val ioDispatcher : CoroutineDispatcher) {
    suspend fun getMovies() {
        withContext(ioDispatcher){
            TODO("Acá se usa el $api para hacer la consulta")
        }
    }
}