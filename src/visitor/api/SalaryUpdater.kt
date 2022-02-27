package visitor.api

class SalaryUpdater : EmployeeUpdater {
    override fun update(employee: Employee, percentageIncrease: Double) {
        employee.salary *= percentageIncrease
    }
}