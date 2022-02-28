package abstract_factory.api

class ReceiverCreator {
    fun create(flag: Flag): Receiver {
        return when(flag) {
            Flag.VISA -> ReceiverVisa()
            else -> ReceiverMasterCard()
        }
    }
}