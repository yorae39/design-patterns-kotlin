package observer.api

interface ObserverStockExchangeAction {
    fun notifyChange(sea: StockExchangeAction)
}