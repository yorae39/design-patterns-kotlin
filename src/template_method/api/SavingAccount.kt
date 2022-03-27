package template_method.api

class SavingAccount : Account() {
    override fun calculateRate(): Double {
        return 1.0
    }
}