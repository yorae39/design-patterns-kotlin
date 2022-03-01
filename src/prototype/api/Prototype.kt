package prototype.api

interface Prototype<T> {
    fun clone(): T
}