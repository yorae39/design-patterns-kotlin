package object_pool.api

class EmployeePool : Pool<Employee> {

    private val employees: MutableList<Employee> = mutableListOf()

    override fun release(): Employee? {
        return if (this.employees.size > 0) {
            this.employees.removeAt(0)
        } else {
            null
        }
    }

    override fun acquire(t: Employee) {
        this.employees.add(t)
    }

}