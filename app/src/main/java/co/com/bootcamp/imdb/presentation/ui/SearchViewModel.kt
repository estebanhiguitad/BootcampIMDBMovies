package co.com.bootcamp.imdb.presentation.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import co.com.bootcamp.imdb.domain.usecases.GetMoviesExampleUseCase
import co.com.bootcamp.imdb.presentation.di.IoDispatcher
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val getMoviesExampleUseCase: GetMoviesExampleUseCase,
    @IoDispatcher private val dispatcher: CoroutineDispatcher
) : ViewModel() {

    fun getMovies() = viewModelScope.launch(dispatcher) {
        getMoviesExampleUseCase()
    }

}
