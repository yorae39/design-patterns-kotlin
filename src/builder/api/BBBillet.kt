package builder.api

import java.time.LocalDate
import java.time.format.DateTimeFormatter


class BBBillet(
    private val payer: String,
    private val assignor: String,
    private val value: Double,
    private val expirationDate: LocalDate,
    private val ourNumber: String
): Billet {

    override fun getPayer(): String {
        return this.payer
    }

    override fun getAssignor(): String {
        return this.assignor
    }

    override fun getValue(): Double {
        return this.value
    }

    override fun getExpirationDate(): LocalDate {
        return this.expirationDate
    }

    override fun getOurNumber(): String {
        return this.ourNumber
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("Billet of Banco do Brasil :\n")
            .append("\tPayer           --> ").append(this.payer).append("\n")
            .append("\tAssignor        --> ").append(this.assignor).append("\n")
            .append("\tValue           --> ").append(this.value).append("\n")
            .append("\tExpiration date --> ").append(this.expirationDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))).append("\n")
            .append("\tOur number      --> ").append(this.ourNumber)

        return sb.toString()
    }

}