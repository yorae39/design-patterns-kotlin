package abstract_factory.api

class IssuerCreator {
    fun create(flag: Flag) : Issuer {
        return when(flag) {
            Flag.VISA -> IssuerVisa()
            else -> IssuerMasterCard()
        }
    }
}