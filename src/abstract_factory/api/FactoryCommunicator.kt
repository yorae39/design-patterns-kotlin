package abstract_factory.api

interface FactoryCommunicator {
    fun issuerCreator(flag: Flag): Issuer
    fun receiverCreator(flag: Flag): Receiver
}