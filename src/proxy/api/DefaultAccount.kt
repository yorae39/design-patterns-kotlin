package proxy.api

class DefaultAccount : Account{

    private var balance: Double = 0.0

    override fun deposit(value: Double) {
        this.balance += value
    }

    override fun cash(value: Double) {
        this.balance -= value
    }

    override fun getBalance(): Double {
        return this.balance
    }
}