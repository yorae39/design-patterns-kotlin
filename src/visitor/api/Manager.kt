package visitor.api

data class Manager(
    val password: String,
    override val name: String,
    override var salary: Double
): Employee(name, salary){

    override fun accepted(employeeUpdater: EmployeeUpdater) {
        employeeUpdater.update(this, 1.43)
    }

}