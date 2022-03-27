package state.api

data class Taximeter(
    var charge: Charge
) {
    fun calculateCharge(time: Double, distance: Double): Double {
        return this.charge.calculateTheCostOfTheTaxiRide(time, distance)
    }
}