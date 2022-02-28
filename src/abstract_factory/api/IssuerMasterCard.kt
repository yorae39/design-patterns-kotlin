package abstract_factory.api

class IssuerMasterCard : Issuer {
    override fun send(message: String) {
        println("Sending message for MasterCard")
        println(message)
    }
}