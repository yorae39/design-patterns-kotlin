package composite.api

data class StretchOnFoot(
    val direction: String,
    val distance: Int
): Stretch {
    override fun print() {
        println("Go Walking: ${this.direction}")
        println("The distance traveled will be: ${this.distance} meters")
    }
}