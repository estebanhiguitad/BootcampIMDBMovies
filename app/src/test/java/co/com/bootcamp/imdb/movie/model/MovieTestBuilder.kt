package co.com.bootcamp.imdb.movie.model

import co.com.bootcamp.imdb.domain.models.Movie

class MovieTestBuilder {
    var id: Int = 634649
    var imageUrl: String = "/iQFcwSGbZXMkeyKrxbPnwnRo5fl.jp"
    var date: String = "2021-12-15"
    var title: String = "Spider-Man: No Way Home"
    var description: String = "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man."

    fun withId(id: Int): MovieTestBuilder {
        this.id = id
        return this
    }

    fun withImageUrl(imageUrl: String): MovieTestBuilder {
        this.imageUrl = imageUrl
        return this
    }

    fun withDate(date: String): MovieTestBuilder {
        this.date = date
        return this
    }

    fun withTitle(title: String): MovieTestBuilder {
        this.title = title
        return this
    }

    fun withDescription(description: String): MovieTestBuilder {
        this.description =  description
        return this
    }

    fun Build(): Movie{
        return Movie(id, imageUrl, date, title, description)
    }

    fun BuildList(): List<Movie>{
        return listOf(Build())
    }
}