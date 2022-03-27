package template_method.main

import template_method.api.CheckingAccount
import template_method.api.SavingAccount

fun main() {
    testAccounts()
}

fun testAccounts() {
    val checkingAccount = CheckingAccount()
    val savingAccount = SavingAccount()

    checkingAccount.deposit(100.0)
    checkingAccount.cash(30.0)

    savingAccount.deposit(100.0)
    savingAccount.cash(10.0)

    println("Balance in Checking Account : ${checkingAccount.getBalance()}")
    println("Balance in Saving Account   : ${savingAccount.getBalance()}")
}
