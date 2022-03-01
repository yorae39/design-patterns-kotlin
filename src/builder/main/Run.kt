package builder.main

import builder.api.BBBilletBuilder
import builder.api.BilletGenerator
import builder.api.ItauBilletBuilder
import java.time.LocalDate


fun main() {
    bbBilletGeneratorTest()
    println()
    itauBilletGeneratorTest()
}

fun bbBilletGeneratorTest() {

    val payer = "Luiz Paulo Aureliano"
    val assignor = "Udemy"
    val value = 100.90
    val expirationDate = LocalDate.now().plusDays(15)
    val ourNumber = "001"

    val builder = BBBilletBuilder(
        payer = payer,
        assignor = assignor,
        value = value,
        expirationDate = expirationDate,
        ourNumber = ourNumber
    )

    println(BilletGenerator().generate(builder))
}

fun itauBilletGeneratorTest() {

    val payer = "Andrea C.O. Aureliano"
    val assignor = "Shopee"
    val value = 50.00
    val expirationDate = LocalDate.now().plusDays(5)
    val ourNumber = "341"

    val builder = ItauBilletBuilder(
        payer = payer,
        assignor = assignor,
        value = value,
        expirationDate = expirationDate,
        ourNumber = ourNumber
    )

    println(BilletGenerator().generate(builder))
}