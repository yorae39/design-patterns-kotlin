package builder.api

import java.time.LocalDate

interface Billet {
    fun getPayer(): String
    fun getAssignor(): String
    fun getValue(): Double
    fun getExpirationDate(): LocalDate
    fun getOurNumber(): String
    override fun toString(): String
}