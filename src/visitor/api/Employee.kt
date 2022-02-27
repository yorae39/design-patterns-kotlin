package visitor.api

abstract class Employee(
    open val name: String,
    open var salary: Double
): Upgradable