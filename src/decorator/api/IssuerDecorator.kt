package decorator.api

abstract class IssuerDecorator(
    private val issuer: Issuer,
): Issuer {

     fun getIssuer(): Issuer {
         return this.issuer
     }

}