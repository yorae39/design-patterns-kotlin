package factory_method.main

import factory_method.api.Issuer
import factory_method.api.IssuerCreator
import factory_method.api.Type.EMAIL
import factory_method.api.Type.SMS
import factory_method.api.Type.JMS

fun main() {
    issuerTest()
}

fun issuerTest() {

    val issuerOfEmail = IssuerCreator().issuerFoType(EMAIL)
    val issuerOfSMS = IssuerCreator().issuerFoType(SMS)
    val issuerOfJMS = IssuerCreator().issuerFoType(JMS)

    send(issuerOfEmail, "Factory Method - Email send!")
    send(issuerOfSMS, "Factory Method - SMS send!")
    send(issuerOfJMS, "Factory Method - JMS send!")
}

fun send(issuer: Issuer, message: String) {
    issuer.send(message)
}