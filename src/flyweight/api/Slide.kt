package flyweight.api

data class Slide(
    private val themeFlyweight: ThemeFlyweight,
    private val title: String,
    private val text: String
) {

    fun print() {
        this.themeFlyweight.print(title, text)
    }

}