package facade.api

data class OrderFacade(
    private val inventory: Inventory,
    private val financial: Financial,
    private val afterSale: AfterSale
) {

    fun registerProduct(order: Order) {
        println("Register product ->")
        this.inventory.sendProduct(order.product, order.addressString, order.client, order.financial)
        this.financial.invoice(order.client, order.product, order.addressString)
        this.afterSale.contactSchedule(order.client, order.product)
    }
}