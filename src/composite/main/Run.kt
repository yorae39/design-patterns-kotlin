package composite.main

import composite.api.CarStretch
import composite.api.Route
import composite.api.StretchOnFoot

fun main() {
    testOfStretch()
}

fun testOfStretch() {

    val stretchWalk = StretchOnFoot(
        direction = "Go to the intersection of Av. Rebouças with Av. Brigadier Faria Lima",
        distance = 500
    )

    val carStretchOne = CarStretch(
        direction = "Go to the intersection of Av. Brigadeiro Faria Lima with Av. Cidade Jardim",
        distance = 1500
    )

    val carStretchTwo = CarStretch(
        direction = "Turn right onto Marginal Pinheiros",
        distance = 500
    )

    val routeOne = Route()
    val routeTwo = Route()

    println("Route one")
    routeOne.add(stretchWalk)
    routeOne.add(carStretchOne)
    routeOne.print()

    println("------------------------------------------------------------------------------------------")
    println("Route two")
    routeTwo.add(carStretchTwo)
    routeTwo.print()


}