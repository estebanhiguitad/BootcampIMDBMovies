package co.com.bootcamp.imdb.presentation.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import co.com.bootcamp.imdb.domain.usecases.GetMoviesExampleUseCaseImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val getMoviesExampleUseCase: GetMoviesExampleUseCaseImpl
) : ViewModel() {

    fun getMovies(listId: Int?) = viewModelScope.launch() {
        getMoviesExampleUseCase.invoke(listId)
    }
}