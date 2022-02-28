package abstract_factory.api

class ReceiverVisa : Receiver {
    override fun receive(): String {
        println("Receiving Visa message!")
        return "Message of Visa: Transaction Ok!"
    }
}