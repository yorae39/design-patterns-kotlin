package prototype.main

import prototype.api.Campaign
import java.time.LocalDate

fun main() {
    prototypeTest()
}

fun prototypeTest() {

    val name = "K19"
    val expirationDate = LocalDate.now().plusDays(30)
    val dailyValue = 500.00
    val keyWord = mutableSetOf<String>()
    keyWord.add("course")
    keyWord.add("kotlin")
    keyWord.add("k19")

    val campaign = Campaign(
        name = name,
        expirationDate = expirationDate,
        dailyValue = dailyValue,
        keyWord = keyWord
    )
    println(campaign)

    println()

    println(campaign.clone())
}