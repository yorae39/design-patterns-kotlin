package visitor.main

import visitor.api.Department
import visitor.api.Liquidator
import visitor.api.Manager
import visitor.api.SalaryUpdater
import visitor.api.Telephonist

fun main() {
    salaryUpdaterTest()
}

fun salaryUpdaterTest() {

    val departmentList = mutableListOf<Department>()
    val departmentOne = Department("DepartmentOne")
    val managerOne = Manager("manager123", "ManagerOne", 1500.00)
    val telephonistOne = Telephonist(18, "telephonistOne", 1000.00)
    val liquidatorOne = Liquidator("asset", "liquidationOne", 900.00)
    departmentOne.employees.add(managerOne)
    departmentOne.employees.add(telephonistOne)
    departmentOne.employees.add(liquidatorOne)
    departmentList.add(departmentOne)

    val departmentTwo = Department("DepartmentTwo")
    val managerTwo = Manager("manager1234", "ManagerTwo", 1700.00)
    val managerThree = Manager("manager12345", "ManagerThree", 1900.00)
    val telephonistTwo = Telephonist(19, "telephonistTwo", 1100.00)
    val liquidatorTwo = Liquidator("backoffice", "liquidationTwo", 800.00)
    departmentTwo.employees.add(managerTwo)
    departmentTwo.employees.add(managerThree)
    departmentTwo.employees.add(telephonistTwo)
    departmentTwo.employees.add(liquidatorTwo)
    departmentList.add(departmentTwo)

    for (dep in departmentList) {
        for (employee in dep.employees) {
            print("Salary before ----> ")
            println("Name: ${employee.name}, salary: ${employee.salary}")
        }
    }
    println("===========================================================")

    val employeeUpdater = SalaryUpdater()

    for (dep in departmentList) {
        dep.accepted(employeeUpdater)
    }

    for (dep in departmentList) {
        for (employee in dep.employees) {
            print("Salary after ----> ")
            println("Name: ${employee.name}, salary: ${employee.salary}")
        }
    }

}