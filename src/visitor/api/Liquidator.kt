package visitor.api

data class Liquidator(
    val nook: String,
    override val name: String,
    override var salary: Double
): Employee(name, salary){

    override fun accepted(employeeUpdater: EmployeeUpdater) {
       employeeUpdater.update(this, 1.27)
    }
}