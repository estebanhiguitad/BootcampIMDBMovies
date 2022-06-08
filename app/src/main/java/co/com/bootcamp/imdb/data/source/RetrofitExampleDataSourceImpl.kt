package co.com.bootcamp.imdb.data.source

import co.com.bootcamp.imdb.presentation.di.IoDispatcher
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * @property api sería una implementación del cliente Http.
 */
class RetrofitExampleDataSourceImpl @Inject constructor(
    private val api: Any,
    @IoDispatcher private val dispatcher: CoroutineDispatcher
) : RetrofitExampleDataSource {

    override suspend fun getMovies() {
        withContext(dispatcher) {
            TODO("Acá se usa el $api para hacer la consulta")
        }
    }

}