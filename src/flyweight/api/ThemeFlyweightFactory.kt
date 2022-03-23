package flyweight.api

class ThemeFlyweightFactory {

    private val themes = HashMap<Class<*>, ThemeFlyweight>()

    val HYPHEN = ThemeHyphen::class.java
    val ASTERISK = ThemeAsterisk::class.java
    val CORPORATE = ThemeCorporate::class.java

    fun getTheme(clazz: Class<*>) : ThemeFlyweight? {
        if (!themes.containsKey(clazz)) {
            try {
                themes[clazz] = clazz.getDeclaredConstructor().newInstance() as ThemeFlyweight
            }catch (e : Exception) {
                println(e.message)
            }
        }
        return themes[clazz]
    }
}


