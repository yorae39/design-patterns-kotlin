package strategy.api

class InsertionSorter : Sorter {
    override fun <E : Comparable<E>> sort(items: MutableList<E>): List<E> {
        if (items.isEmpty() || items.size < 2) {
            return items
        }
        for (count in 1 until items.count()) {
            val key = items[count]
            var j = count - 1
            while (j >= 0 && items[j] > key) {
                items[j + 1] = items[j]
                j -= 1
            }
            items[j + 1] = key

           /*
            FORMA 2
            val key = items[count]
            var j = count - 1
            while (j >= 0 && items[j].compareTo(key) > 0) { // ESSA LINHA ALTERADA
                items[j + 1] = items[j]
                j-- // ALTERADA
            }
            items[j + 1] = key*/

           /*
            FORMA 3
            val item = items[count]
            var i = count
            while (i > 0 && item < items[i - 1]) {
                items[i] = items[i -1]
                i -= 1
            }
            items[i] = item*/
        }
        return items
    }
}