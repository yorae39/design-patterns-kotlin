package state.api

class ChargeOne : Charge {
    override fun calculateTheCostOfTheTaxiRide(time: Double, distance: Double): Double {
        return 5.0 + time * 1.5 + distance  * 1.7
    }
}