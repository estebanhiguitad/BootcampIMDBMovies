package co.com.bootcamp.imdb.data.source

import android.util.Log
import co.com.bootcamp.imdb.domain.models.MovieListResponse
import co.com.bootcamp.imdb.presentation.di.IoDispatcher
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * @property api sería una implementación del cliente Http.
 */
class RetrofitExampleDataSourceImpl @Inject constructor(
    private val api: RetrofitManager,
    @IoDispatcher private val dispatcher: CoroutineDispatcher
) {

    suspend fun getMoviesList(listId: Int?, apiKey: String?): MovieListResponse {
        return withContext(dispatcher) {
            Log.e("Hola", api.create().getMoviesList(listId, apiKey).moviesList[0].description)
            api.create().getMoviesList(listId, apiKey)
        }
    }
}