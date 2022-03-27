package state.api

interface Charge {
    fun calculateTheCostOfTheTaxiRide(time: Double, distance: Double): Double
}