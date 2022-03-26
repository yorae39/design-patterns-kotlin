package mediator.api

class TaxiCenter {
    private val freeTaxis = ArrayList<Taxi>()
    private val waitingPassengers = ArrayList<Passenger>()

    @Synchronized
    fun addTaxiAvailable(taxi: Taxi) { // SYNCHRONIZED EM KOLTIN USA A ANOTAÇÃO - @Synchronized
        println("Taxi ${taxi.id} called to queue")
        freeTaxis.add(taxi)
        this.notifyAll()
    }

    fun askForTaxi(passenger: Passenger) {
        val taxi = this.waitForTheTaxi(passenger)
        println("Taxi ${taxi.id} taking passenger ${passenger.name}")
        taxi.answerTheRequest()
    }

    private fun waitForTheTaxi(passenger: Passenger): Taxi {
        this.waitingPassengers.add(passenger)
        synchronized(this) {
            while (this.freeTaxis.isEmpty() || this.waitingPassengers[0] != passenger) { //THREADS NÃO SÃO EXECUTADOAS EM ORDEM - [PARALELISMO]
                try {
                    this.wait() // ESPERA PELO PASSAGEIRO CORRETO, QUE CHEGOU NA FILA PRIMEIRO
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
            this.waitingPassengers.removeAt(0)
            return this.freeTaxis.removeAt(0)
        }
        //ARTIGOS SOBRE THREADS:
      /*
        https://www.devmedia.com.br/threads-paralelizando-tarefas-com-os-diferentes-recursos-do-java/34309
        https://sites.google.com/site/profferdesiqueiraprogconc/aulas/4-ordem-de-execucao-das-threads
      */
    }

    @Suppress("PLATFORM_CLASS_MAPPED_TO_KOTLIN")
    private fun Any.wait() = (this as Object).wait()

    @Suppress("PLATFORM_CLASS_MAPPED_TO_KOTLIN")
    private fun Any.notifyAll() = (this as Object).notifyAll()

}