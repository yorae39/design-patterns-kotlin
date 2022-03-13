package decorator.api

class IssuerDecoratorWithCryptographic(
    issuer: Issuer
): IssuerDecorator(issuer) {

    override fun send(message: String) {
        println("Send message with cryptography.")
        this.getIssuer().send(cryptographicMessage(message))
    }

    private fun cryptographicMessage(message: String): String {
        return StringBuilder(message).reverse().toString()
    }
}