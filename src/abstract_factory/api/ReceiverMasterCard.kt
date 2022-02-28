package abstract_factory.api

class ReceiverMasterCard : Receiver {
    override fun receive(): String {
        println("Receiving MasterCard message!")
        return "Message of MasterCard: Transaction OK!"
    }
}