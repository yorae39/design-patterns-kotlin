package state.main

import state.api.ChargeOne
import state.api.ChargeTwo
import state.api.Taximeter

fun main() {
    testTaximeter()
}

fun testTaximeter() {
    val chargeOne = ChargeOne()
    val chargeTwo = ChargeTwo()

    val taximeter = Taximeter(chargeOne)

    val valueOne = taximeter.calculateCharge(10.0, 20.0)
    println("Race value at charge 1 : $valueOne")

    taximeter.charge = chargeTwo
    val valueTwo = taximeter.calculateCharge(5.0, 30.0)
    println("Race value at charge 2 : $valueTwo")
}