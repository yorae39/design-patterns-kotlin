package facade.main

import facade.api.Address
import facade.api.AfterSale
import facade.api.Client
import facade.api.Financial
import facade.api.Inventory
import facade.api.Order
import facade.api.OrderFacade
import facade.api.Product

fun main() {
    testOrderFacade()
}

fun testOrderFacade() {
    val client = Client("LPA")
    val product = Product("Notebook")
    val address = Address("Agamenon Magalhães, 2131 / Boa Vista - SG")
    val inventory = Inventory()
    val financial = Financial()
    val afterSale = AfterSale()

    val order = Order(
        client,
        product,
        address,
        financial
    )
    val orderFacade = OrderFacade(
        inventory = inventory,
        financial = financial,
        afterSale = afterSale
    )

    orderFacade.registerProduct(order)
}