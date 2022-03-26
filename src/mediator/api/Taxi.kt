package mediator.api

data class Taxi(
    var id : Int,
    private val taxiCenter: TaxiCenter,
) {

    fun answerTheRequest() {
        try {
            Thread.sleep((Math.random() * 3000.0).toLong())
        }catch (e: InterruptedException) {
            e.printStackTrace()
        }
        this.taxiCenter.addTaxiAvailable(this)
    }
}