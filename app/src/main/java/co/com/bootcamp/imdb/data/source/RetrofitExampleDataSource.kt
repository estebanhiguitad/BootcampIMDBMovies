package co.com.bootcamp.imdb.data.source

interface RetrofitExampleDataSource {
    suspend fun getMovies()
}