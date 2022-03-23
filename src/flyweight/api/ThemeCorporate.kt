package flyweight.api

import java.util.*
import kotlin.math.floor

class ThemeCorporate : ThemeFlyweight {
    override fun print(title: String, text: String) {
        println("########## ${title.uppercase(Locale.getDefault())} ##########")
        println(text)
        val footerE = CharArray(floor((6 + title.length) / 2.0).toInt())
        val footerD = CharArray(floor((6 + title.length) / 2.0).toInt())

        Arrays.fill(footerE, '#')
        Arrays.fill(footerD, '#')

        println(String(footerE).plus(" www.lpa.corp.com.br ").plus(String(footerD)))
    }
}