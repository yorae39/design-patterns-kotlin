package flyweight.api

class Presentation {
    private val slides = mutableListOf<Slide>()

    fun addSlide(slide: Slide) {
        slides.add(slide)
    }

    fun print() {
        for (slide in slides) {
            slide.print()
            println()
        }
    }
}