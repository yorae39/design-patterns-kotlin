package proxy.main

import proxy.api.DefaultAccount
import proxy.api.ProxyAccount

fun main() {
    testProxy()
}

fun testProxy() {
    val defaultAccount = DefaultAccount()
    val proxyAccount = ProxyAccount(defaultAccount)
    proxyAccount.deposit(100.0)
    proxyAccount.cash(60.0)
    println("The balance is: ${proxyAccount.getBalance()}")
}