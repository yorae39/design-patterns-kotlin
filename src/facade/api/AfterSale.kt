package facade.api

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class AfterSale {

    fun contactSchedule(client: Client, product: Product) {
        println("\nAfter sale ->")
        val dateFormat = LocalDate.now().plusDays(1).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
        println("\tGet in touch with client ${client.name} about the product ${product.name} in day : $dateFormat")
    }
}