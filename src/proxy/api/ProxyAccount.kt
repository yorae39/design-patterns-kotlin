package proxy.api

class ProxyAccount(
    private val account: Account
) : Account {

    override fun deposit(value: Double) {
        println("Making the deposit of R$ $value ...")
        this.account.deposit(value)
        println("Deposit of R$ $value made...")
    }

    override fun cash(value: Double) {
        println("Making the cashout of R$ $value ...")
        this.account.cash(value)
        println("Cashout of R$ $value made...")
    }

    override fun getBalance(): Double {
        println("Checking of the balance...")
        return this.account.getBalance()
    }
}