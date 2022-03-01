package prototype.api

import java.time.LocalDate
import java.time.format.DateTimeFormatter


data class Campaign(
    val name: String,
    val expirationDate: LocalDate,
    val dailyValue: Double,
    val keyWord: Set<String>
): Prototype<Campaign> {

    override fun clone(): Campaign {
        val name = "Copy of campaign : ${this.name}"
        val expirationDate = this.expirationDate
        val dailyValue = this.dailyValue
        val keyWord = HashSet<String>(this.keyWord)
        return Campaign(
            name = name,
            expirationDate = expirationDate,
            dailyValue = dailyValue,
            keyWord = keyWord
        )
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("Campaign :\n")
            .append("\tName            --> ").append(this.name).append("\n")
            .append("\tExpiration date --> ").append(this.expirationDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))).append("\n")
            .append("\tDaily value     --> ").append(this.dailyValue).append("\n")
            .append("\tKey word        --> ").append(this.keyWord)

        return sb.toString()
    }
}