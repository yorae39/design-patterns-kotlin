package abstract_factory.api

class IssuerVisa : Issuer {
    override fun send(message: String) {
        println("Sending message for Visa")
        println(message)
    }
}