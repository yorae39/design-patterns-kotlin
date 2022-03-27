package state.api

class ChargeTwo : Charge {
    override fun calculateTheCostOfTheTaxiRide(time: Double, distance: Double): Double {
        return 10.0 + time * 3.0 + distance * 4.0
    }
}