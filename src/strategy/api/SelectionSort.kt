package strategy.api

class SelectionSort : Sorter {
    override fun <E : Comparable<E>> sort(items: MutableList<E>): List<E> {
        val len = items.size
        // ENCONTRA O MENOR VALOR DO ARRAY
        for (i in 0 until (len - 1)) {
            //OBTENDO O ÍNDICE ONDE O MENOR VALOR ESTÁ PRESENTE
            var index = i
            for (j in  (i + 1) until len) {
                if (items[j] < items[index]) index = j //compareTo
            }
            // TEMOS O MENOR ELEMENTO, AGORA TROQUE-O COM O PRIMEIRO ELEMENTO
            val temp = items[index]
            items[index] = items[i]
            items[i] = temp
        }
        return items
    }
}