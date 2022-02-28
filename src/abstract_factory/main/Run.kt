package abstract_factory.main

import abstract_factory.api.FactoryCommunicatorImpl
import abstract_factory.api.Flag
import abstract_factory.api.Flag.VISA
import abstract_factory.api.Flag.MASTERCARD
import abstract_factory.api.IssuerCreator
import abstract_factory.api.MasterCardCommunicatorFactory
import abstract_factory.api.ReceiverCreator
import abstract_factory.api.VisaCommunicatorFactory

fun main() {

    val visaTransaction = "Value=450;Password=1234"
    communicatorVisaTest(visaTransaction, VISA)

    val masterTransaction = "Value=550;Password=4321"
    communicatorMasterCardTest(masterTransaction, MASTERCARD)

    val masterTransactionError = "Value=650;Password=5678"
    communicatorErrorMasterCardTest(masterTransactionError, VISA)
}

fun communicatorVisaTest(transaction: String, flag: Flag) {
    val communicator = createCommunicator()
    val visaCommunicator = VisaCommunicatorFactory(communicator)
    visaCommunicator.issuer(flag).send(transaction)
    println(visaCommunicator.receiver(flag).receive())
}

fun communicatorMasterCardTest(transaction: String, flag: Flag) {
    val communicator = createCommunicator()
    val masterCardCommunicator = MasterCardCommunicatorFactory(communicator)
    masterCardCommunicator.issuer(flag).send(transaction) // Atalho para: // val m = masterCardCommunicator.issuer(flag) // m.send(transaction)
    println(masterCardCommunicator.receiver(flag).receive())
}

fun communicatorErrorMasterCardTest(transaction: String, flag: Flag) {
    val communicator = createCommunicator()
    val masterCardCommunicator = MasterCardCommunicatorFactory(communicator)
    masterCardCommunicator.issuer(flag).send(transaction)
}

fun createCommunicator(): FactoryCommunicatorImpl {
    val issuerCreator = IssuerCreator()
    val receiverCreator = ReceiverCreator()
    return FactoryCommunicatorImpl(issuerCreator, receiverCreator)
}