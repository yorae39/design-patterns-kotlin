package decorator.main

import decorator.api.BasicIssuer
import decorator.api.IssuerDecoratorWithCompression
import decorator.api.IssuerDecoratorWithCryptographic

fun main() {
    issuerDecoratorTest()
}

fun issuerDecoratorTest() {
    val message = "LPA"
    val issuerCrypt = IssuerDecoratorWithCryptographic(BasicIssuer())
    issuerCrypt.send(message)
    println("---------------------------------------------------------------")

    val issuerCompression = IssuerDecoratorWithCompression(BasicIssuer())
    issuerCompression.send(message)
}