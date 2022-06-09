package co.com.bootcamp.imdb.data.di

import co.com.bootcamp.imdb.data.repositories.MovieRemoteExampleRepository
import co.com.bootcamp.imdb.data.source.RetrofitExampleDataSource
import co.com.bootcamp.imdb.data.source.RetrofitManager
import co.com.bootcamp.imdb.domain.repositories.MovieExampleRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindMovieExampleRepository(movieRemoteExampleRepository: MovieRemoteExampleRepository): MovieExampleRepository

    companion object {
        @Provides
        fun providerRetrofit(): RetrofitExampleDataSource =
            RetrofitManager().create()

        @Provides
        fun retrofitManager(): RetrofitManager =
            RetrofitManager()
    }
}
