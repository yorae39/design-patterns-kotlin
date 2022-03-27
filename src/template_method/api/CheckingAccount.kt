package template_method.api

class CheckingAccount : Account() {
    override fun calculateRate(): Double {
        return 3.0
    }
}