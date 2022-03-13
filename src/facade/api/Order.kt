package facade.api

data class Order(
    val client: Client,
    val product: Product,
    val addressString: Address,
    val financial: Financial
)