package flyweight.api

import java.util.*

class ThemeHyphen : ThemeFlyweight {
    override fun print(title: String, text: String) {
        println("----------- $title -----------")
        println(text)
        val footer = CharArray(22 + title.length)
        Arrays.fill(footer, '-')
        println(footer)
    }
}