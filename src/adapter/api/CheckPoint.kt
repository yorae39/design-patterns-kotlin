package adapter.api

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

open class CheckPoint {

    open fun entranceRegister(employee: Employee) {
        val entranceDate = LocalDateTime.now()
        println("Entrance employee : ${employee.name} in ${entranceDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy-hh:mm:ss"))}")
    }

    open fun exitRegister(employee: Employee) {
        val exitDate = LocalDateTime.now()
        println("Exit employee     : ${employee.name} in ${exitDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy-hh:mm:ss"))}")
    }
}
