package flyweight.api

import java.util.*

class ThemeAsterisk : ThemeFlyweight {
    override fun print(title: String, text: String) {
        println("*********** $title *********** ")
        println(text)
        val footer = CharArray(22 + title.length)
        Arrays.fill(footer, '*')
        println(footer)
    }
}