package builder.api

import java.time.LocalDate

class ItauBilletBuilder(
    private var payer: String,
    private var assignor: String,
    private var value: Double,
    private var expirationDate: LocalDate,
    private var ourNumber: String
): BilletBuilder {

    override fun builderPayer(payer: String) {
        this.payer = payer
    }

    override fun builderAssignor(assignor: String) {
        this.assignor = assignor
    }

    override fun builderValue(value: Double) {
        this.value = value
    }

    override fun builderExpirationDate(expirationDate: LocalDate) {
        this.expirationDate = expirationDate
    }

    override fun builderOurNumber(ourNumber: String) {
        this.ourNumber = ourNumber
    }

    override fun getBillet(): Billet {
        return ItauBillet(
            payer = payer,
            assignor = assignor,
            value = value,
            expirationDate = expirationDate,
            ourNumber = ourNumber
        )
    }
}