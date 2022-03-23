package flyweight.api

import kotlin.reflect.KClass

class ThemeFlyweightFactory {

    private val themes = HashMap<KClass<*>, ThemeFlyweight>()

    val HYPHEN = ThemeHyphen::class
    val ASTERISK = ThemeAsterisk::class
    val CORPORATE = ThemeCorporate::class

    fun getTheme(clazz: KClass<*>) : ThemeFlyweight? {
        if (!themes.containsKey(clazz)) {
            try {
                themes[clazz] = clazz.java.getDeclaredConstructor().newInstance() as ThemeFlyweight
            }catch (e : Exception) {
                println(e.message)
            }
        }
        return themes[clazz]
    }
}


