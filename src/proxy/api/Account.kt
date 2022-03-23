package proxy.api

interface Account {
    fun deposit(value: Double)
    fun cash(value: Double)
    fun getBalance(): Double
}