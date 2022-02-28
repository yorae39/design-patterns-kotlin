package abstract_factory.api
import abstract_factory.api.Flag.VISA

// FABRICA DE EMISSORES E RECEPTORES VISA
class VisaCommunicatorFactory(
    private val communicator: FactoryCommunicatorImpl
) {

    fun issuer(flag: Flag) : Issuer {
        return if (flag == VISA) communicator.issuerCreator(flag)
        else throw IllegalArgumentException("Illegal flag of communicator")
    }

    fun receiver(flag: Flag): Receiver {
        return if (flag == VISA) communicator.receiverCreator(flag)
        else throw IllegalArgumentException("Illegal flag of communicator")
    }

}