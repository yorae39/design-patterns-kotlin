package factory_method.api

class IssuerOfSMS : Issuer {
    override fun send(message: String) {
        println("Sending the message by SMS")
        println(message)
    }
}