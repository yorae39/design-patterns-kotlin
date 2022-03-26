package mediator.main

import mediator.api.Passenger
import mediator.api.Taxi
import mediator.api.TaxiCenter

fun main() {
    testTaxiCenter()
}

fun testTaxiCenter() {
    val taxiCenter = TaxiCenter()

    val passenger1 = Passenger("Luiz Paulo", taxiCenter)
    val passenger2 = Passenger("Andrea", taxiCenter)
    val passenger3 = Passenger("Bernardo", taxiCenter)

    val taxi1 = Taxi(1,taxiCenter)
    val taxi2 = Taxi(2,taxiCenter)

    taxiCenter.addTaxiAvailable(taxi1)
    taxiCenter.addTaxiAvailable(taxi2)

    Thread(passenger1).start()
    Thread(passenger2).start()
    Thread(passenger3).start()
}