package factory_method.api

class IssuerOfJMS : Issuer {
    override fun send(message: String) {
        println("Sending the message by JMS")
        println(message)
    }
}