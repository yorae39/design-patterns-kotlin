package template_method.api

abstract class Account {
    private var balance: Double = 0.0

    fun deposit(value: Double) {
        this.balance += value
        this.balance -= calculateRate()

    }

    fun cash(value: Double) {
        this.balance -= value
        this.balance -= calculateRate()
    }

    abstract fun calculateRate(): Double

    fun getBalance(): Double {
        return this.balance
    }

}