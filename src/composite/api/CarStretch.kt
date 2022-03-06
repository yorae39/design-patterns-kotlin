package composite.api

data class CarStretch(
    val direction: String,
    val distance: Int
): Stretch {
    override fun print() {
        println("Go by Car: ${this.direction}")
        println("The distance traveled will be: ${this.distance} meters")
    }
}