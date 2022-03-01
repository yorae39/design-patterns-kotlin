package singleton.main

import singleton.api.Configuration
import singleton.api.FileProperties

fun main() {
    singletonTest()
}

fun singletonTest() {
    val properties = FileProperties()
    val configuration = Configuration.Config.getInstance(properties.returnProperties())
    val configA = configuration
    val configB = configuration
    println(configA.getProperties("currency-code"))
    println(configB.getProperties("time-zone"))

    if (configA.equals(configB)) {
        println("Equal instances")
    }
}