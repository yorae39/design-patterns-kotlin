package mediator.api

data class Passenger(
    val name: String,
    private val taxiCenter: TaxiCenter
): Runnable {

    override fun run() {
        //for (i in 0..5) { //CASO QUEIRA SIMULAR VÁRIAS INTERAÇÕES DE CORRIDAS
            this.taxiCenter.askForTaxi(this)
        //}
    }
}