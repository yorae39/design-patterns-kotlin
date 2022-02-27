package visitor.api

data class Department(
    val name: String,
    val employees: MutableList<Employee> = mutableListOf()
){
    fun accepted(employeeUpdater: EmployeeUpdater) {
        for (employee in this.employees) {
            employee.accepted(employeeUpdater)
        }
    }
}