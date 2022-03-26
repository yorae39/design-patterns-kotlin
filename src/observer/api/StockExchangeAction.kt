package observer.api

data class StockExchangeAction(
    val code: String,
    var value: Double
){
    private val interested = LinkedHashSet<ObserverStockExchangeAction>()

    fun registerInterested(interest: ObserverStockExchangeAction) {
        this.interested.add(interest)
    }

    fun cancelInterest(interest: ObserverStockExchangeAction) {
        this.interested.remove(interest)
    }

    fun updateValue(value: Double) {
        this.value = value
        for (interest in this.interested) {
            interest.notifyChange(this)
        }
    }
}