package adapter.api

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class NewCheckPoint {
    fun register(employee: Employee, entrance: Boolean) {
        val registerDate = LocalDateTime.now()
        if (entrance) {
            println("Entrance employee : ${employee.name} in ${registerDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy-hh:mm:ss"))}")
        } else {
            println("Exit employee     : ${employee.name} in ${registerDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy-hh:mm:ss"))}")
        }
    }
}