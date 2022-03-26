package iterator.main

import iterator.api.Item
import iterator.api.Menu
import iterator.api.Movie
import iterator.api.Movies
import iterator.api.Product
import iterator.api.ProductListCollection

fun main() {
    testIteratorMovie()
    println()
    testIteratorProduct()
    println()
    testMenuIterator()
}

fun testIteratorMovie() {
    val movies = Movies(mutableListOf(Movie("Ben-Hur"), Movie("José do Egito"), Movie("Matrix")))

    movies.forEach{
        println(it.name)
    }
}

fun testIteratorProduct() {
    val products = ProductListCollection()
    products.add(Product("Coca-Cola"))
    products.add(Product("PS4"))
    products.add(Product("NoteBook"))

    val iterator = products.createIterator()

    while (iterator.hasNext()) {
        val currentProduct = iterator.next()
        println(currentProduct.toString())
    }

}

fun testMenuIterator() {

    val item1 = Item("Caranguejo", 65.0F)
    val item2 = Item("Big-Tasty", 27.0F)
    val item3 = Item("Churrasco p/ pessoa", 60.0F)
    val item4 = Item("Yaksoba", 36.90F)

    val menu = Menu()
    menu.addItem(item1)
    menu.addItem(item2)
    menu.addItem(item3)
    menu.addItem(item4)

    menu.remove(item4)

    println("-----------------------------Displaying Menu-----------------------------")
    val iterator = menu.iterator()
    while (iterator.hasNext()) {
        val item = iterator.next()
        println(item)
    }


}