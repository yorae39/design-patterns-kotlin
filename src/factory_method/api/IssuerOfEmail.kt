package factory_method.api

class IssuerOfEmail : Issuer {
    override fun send(message: String) {
        println("Sending the message by email")
        println(message)
    }
}