package strategy.main

import strategy.api.InsertionSorter
import strategy.api.SelectionSort

fun main() {
    //testInsertionSorter()
    //testSelectionSorter()
    //testSelectionSorter2()
    testSelectionSorter3()
}

fun testInsertionSorter() {
    val items = mutableListOf(8, 3, 2, 7, 4)
    println(items)
    val insertionSorter = InsertionSorter()
    println(insertionSorter.sort(items))
}

fun testSelectionSorter() {
    val items = mutableListOf(4, 9, 3, -2, 0, 7, -5, 1, 6, 8)
    println(items)
    val selectionSort = SelectionSort()
    println(selectionSort.sort(items))
}

fun testSelectionSorter2() {
    val items = mutableListOf("Luiz Paulo", "Jorge", "Thiago", "Kaio")
    println(items)
    val selectionSort = SelectionSort()
    println(selectionSort.sort(items))
}

fun testSelectionSorter3() {
    val items = mutableListOf(256.00, 345.98, 120.25, 35.00)
    println(items)
    val selectionSort = SelectionSort()
    println(selectionSort.sort(items))
}
