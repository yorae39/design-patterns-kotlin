package facade.api

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Inventory {

    fun sendProduct(product: Product, address: Address, client: Client, financial: Financial) {
        val dateFormat = LocalDate.now().plusDays(1).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
       println("\tThe product ${product.name} will be delivered to the address ${address.addressString} until 18:00 of the day $dateFormat")
    }
}