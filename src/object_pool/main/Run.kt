package object_pool.main

import object_pool.api.Employee
import object_pool.api.EmployeePool

fun main() {
    poolTest()
}

fun poolTest() {
    val employees = createEmployeeList()
    val employeePool = EmployeePool()
    for (employee in employees) {
        println("Acquiring employee: ${employee.name}")
        employeePool.acquire(employee)
    }
    var employee = employeePool.release()
    println()
    while (employee != null) {
        println("Releasing employee: ${employee.name}")
        employee = employeePool.release()
    }
}


fun createEmployeeList(): MutableList<Employee> {
    val employees = mutableListOf<Employee>()
    val employee1 = Employee("Luiz Paulo")
    val employee2 = Employee("Thiago")
    val employee3 = Employee("Jorge")
    val employee4 = Employee("Kaio")

    employees.add(employee1)
    employees.add(employee2)
    employees.add(employee3)
    employees.add(employee4)

    return employees
}