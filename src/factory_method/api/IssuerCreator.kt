package factory_method.api

import factory_method.api.Type.EMAIL
import factory_method.api.Type.SMS

class IssuerCreator{

    fun issuerFoType(type: Type): Issuer {
        return when(type) {
            EMAIL -> IssuerOfEmail()
            SMS -> IssuerOfSMS()
            else -> IssuerOfJMS()
        }
    }
}