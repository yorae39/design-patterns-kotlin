package object_pool.api

interface Pool<T> {
    fun release(): T?
    fun acquire(t: T)
}