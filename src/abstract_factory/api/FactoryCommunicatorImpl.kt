package abstract_factory.api

// FABRICA DE EMISSORES E RECEPTORES
class FactoryCommunicatorImpl(
    private val issuerCreator: IssuerCreator,
    private val receiverCreator: ReceiverCreator
): FactoryCommunicator  {

    override fun issuerCreator(flag: Flag): Issuer {
        return issuerCreator.create(flag)
    }

    override fun receiverCreator(flag: Flag): Receiver {
        return receiverCreator.create(flag)
    }
}