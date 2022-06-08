package co.com.bootcamp.imdb.data.di

import co.com.bootcamp.imdb.data.source.RetrofitExampleDataSource
import co.com.bootcamp.imdb.data.source.RetrofitExampleDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {

    @Binds
    abstract fun bindRetrofitExampleDataSource(retrofitExampleDataSourceImpl: RetrofitExampleDataSourceImpl): RetrofitExampleDataSource

}
