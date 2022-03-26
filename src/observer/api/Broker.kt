package observer.api

data class Broker(
    private val name: String
): ObserverStockExchangeAction {

    override fun notifyChange(sea: StockExchangeAction) {
        println("Broker ${this.name} being notified: ")
        println("\tThe Stock Exchange Action ${sea.code} had its value changed to ${sea.value}")
    }

}