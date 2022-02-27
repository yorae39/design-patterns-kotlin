package visitor.api

interface EmployeeUpdater {
    fun update(employee: Employee, percentageIncrease: Double)
}