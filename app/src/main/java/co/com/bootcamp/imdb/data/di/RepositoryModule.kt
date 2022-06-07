package co.com.bootcamp.imdb.data.di

import co.com.bootcamp.imdb.data.repositories.MovieRemoteExampleRepository
import co.com.bootcamp.imdb.domain.repositories.MovieExampleRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMovieExampleRepository(movieRemoteExampleRepository: MovieRemoteExampleRepository): MovieExampleRepository

}
