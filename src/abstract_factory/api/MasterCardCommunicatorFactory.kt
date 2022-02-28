package abstract_factory.api
import abstract_factory.api.Flag.MASTERCARD

// FABRICA DE EMISSORES E RECEPTORES MASTER
class MasterCardCommunicatorFactory(
    private val communicator: FactoryCommunicatorImpl,
) {

    fun issuer(flag: Flag): Issuer {
        return if (flag == MASTERCARD) communicator.issuerCreator(flag)
        else throw IllegalArgumentException("Illegal flag of communicator")
    }

    fun receiver(flag: Flag): Receiver {
        return if (flag == MASTERCARD) communicator.receiverCreator(flag)
        else throw IllegalArgumentException("Illegal flag of communicator")
    }
}