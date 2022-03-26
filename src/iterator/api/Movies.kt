package iterator.api

import kotlin.collections.Iterator

class Movies(
    private val movies: MutableList<Movie> = mutableListOf(),
): Iterable<Movie> {

    override fun iterator(): Iterator<Movie> = MoviesIterator(movies)

    private class MoviesIterator(
        val movies: MutableList<Movie> = mutableListOf(),
        var current: Int = 0,
    ): Iterator<Movie> {

        override fun hasNext(): Boolean = movies.size > current

        override fun next(): Movie {
            val movie = movies[current]
            current++
            return movie
        }

    }

}


