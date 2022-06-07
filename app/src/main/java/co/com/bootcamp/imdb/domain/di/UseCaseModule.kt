package co.com.bootcamp.imdb.domain.di

import co.com.bootcamp.imdb.domain.usecases.GetMoviesExampleUseCase
import co.com.bootcamp.imdb.domain.usecases.GetMoviesExampleUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class UseCaseModule {

    @Binds
    abstract fun bindGetMoviesExampleUseCase(getMoviesExampleUseCaseImpl: GetMoviesExampleUseCaseImpl): GetMoviesExampleUseCase
}