package iterator.api

import kotlin.collections.Iterator

class Menu {

    private val menuItems = ArrayList<Item>()

    fun addItem(item: Item) {
        menuItems.add(item)
    }

    fun remove(item: Item) {
        menuItems.remove(item)
    }

    fun iterator(): Iterator<Item> {
        return MenuIterator(this)
    }

    private class MenuIterator(val menu: Menu) : Iterator<Item> {

        var currentIndex = 0

        override fun hasNext(): Boolean {
            return currentIndex < menu.menuItems.size
        }

        override fun next(): Item {
            return menu.menuItems[currentIndex++]
        }

    }

}