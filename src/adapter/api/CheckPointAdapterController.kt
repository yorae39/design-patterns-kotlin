package adapter.api

data class CheckPointAdapterController(
    private val newCheckPoint: NewCheckPoint
): CheckPoint() {

    override fun entranceRegister(employee: Employee) {
        this.newCheckPoint.register(employee, true)
    }

    override fun exitRegister(employee: Employee) {
        this.newCheckPoint.register(employee, false)
    }
}