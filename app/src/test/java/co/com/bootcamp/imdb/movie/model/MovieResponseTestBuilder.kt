package co.com.bootcamp.imdb.movie.model

class MovieResponseTestBuilder  {
    var moviesList: List<MovieTestBuilder>

    init {
        this.moviesList = mutableListOf(MovieTestBuilder())
    }

    fun withMovieList(moviesList: List<MovieTestBuilder>): MovieResponseTestBuilder {
        this.moviesList = moviesList
        return this
    }
}