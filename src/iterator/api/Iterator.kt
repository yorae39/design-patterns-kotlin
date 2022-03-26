package iterator.api

interface Iterator {
    fun next(): Product
    fun hasNext(): Boolean
}