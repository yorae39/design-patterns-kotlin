package decorator.api

class BasicIssuer : Issuer {
    override fun send(message: String) {
        println("Send message: ")
        println(message)
    }
}