package iterator.api

data class Item(
    private val name: String,
    private val price: Float
) {
    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("Name of item: ").append(name).append(" - Price of item: R$ ").append(price)
        return sb.toString()
    }
}