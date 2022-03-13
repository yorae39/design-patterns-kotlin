package facade.api

class Financial {

    fun invoice(client: Client, product: Product, address: Address){
        println("\nInvoice financial ->")
        println("\tClient: ${client.name}")
        println("\tProduct: ${product.name}")
        println("\tAddress: ${address.addressString}")
    }

}