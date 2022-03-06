package adapter.main

import adapter.api.CheckPoint
import adapter.api.CheckPointAdapterController
import adapter.api.Employee
import adapter.api.NewCheckPoint


fun main() {
    checkpointTest()
    println()
    newCheckPoint()
}

fun checkpointTest() {
    val employee = Employee("LPA")
    val checkPoint = CheckPoint()
    checkPoint.entranceRegister(employee)
    Thread.sleep(3000)
    checkPoint.exitRegister(employee)
}

fun newCheckPoint() {

    val checkPoint = CheckPointAdapterController(NewCheckPoint())
    val employee = Employee("LPA")
    checkPoint.entranceRegister(employee)
    Thread.sleep(3000)
    checkPoint.exitRegister(employee)
}