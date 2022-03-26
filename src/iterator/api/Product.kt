package iterator.api

class Product(val name: String){
    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("Name of product: ").append(name)
        return sb.toString()
    }
}