package muliton.main

import muliton.api.Theme
import muliton.api.Type.FIRE
import muliton.api.Type.SKY
import java.awt.Color

fun main() {
    themeTest()
}

fun themeTest() {

    val themes = mutableMapOf<String, Theme>()

    val skyTheme = Theme(
        name = "SkyTheme",
        backGroundColor = Color.BLUE,
        fontColor = Color.BLACK,
        type = SKY,
    )

    val fireTheme = Theme(
        name = "FireTheme",
        backGroundColor = Color.RED,
        fontColor = Color.WHITE,
        type = FIRE
    )

    val instanceA = Theme.Config.getInstance(skyTheme)
    val instanceB = Theme.Config.getInstance(fireTheme)

    themes["SkyTheme"] =  instanceA
    themes["FireTheme"] =  instanceB

    println(instanceA)
    println()
    println(instanceB)
    println()
    println("InstanceA == InstanceB : ${instanceA == instanceB}\n")
    println("----------------------------------------------------------------------------------------\n")
    println("Returning theme by returnThemeForNameOne :\n ${instanceA.returnThemeForNameOne(skyTheme)}")
    println()
    println("Returning theme by returnThemeForNameTwo")
    for (t in skyTheme.returnThemeForNameTwo()) {
        println(t.toString())
    }
    println()
    println("Returning themes by map themes")
    for (t in themes) {
        println(t.toString())
        println()
    }
    println()
}