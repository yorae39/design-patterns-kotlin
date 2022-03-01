package builder.api

import java.time.LocalDate

interface BilletBuilder {
    fun builderPayer(payer: String)
    fun builderAssignor(assignor: String)
    fun builderValue(value: Double)
    fun builderExpirationDate(expirationDate: LocalDate)
    fun builderOurNumber(ourNumber: String)
    fun getBillet(): Billet
}
