package visitor.api

interface Upgradable {
    fun accepted(employeeUpdater: EmployeeUpdater)
}