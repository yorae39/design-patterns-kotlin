package strategy.api

interface Sorter {
    fun <E : Comparable<E>> sort(items: MutableList<E>): List<E>
}