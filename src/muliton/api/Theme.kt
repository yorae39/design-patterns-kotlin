package muliton.api

import java.awt.Color


class Theme(
    private val name: String,
    private val backGroundColor: Color,
    private val fontColor: Color,
    private val type: Type,
) {
    private val themes: MutableMap<String, Theme> = mutableMapOf()

    object Config {
        fun getInstance(theme: Theme): Theme {
            return Theme(
                name = theme.name,
                backGroundColor = theme.backGroundColor,
                fontColor = theme.fontColor,
                type = theme.type,
            )
        }
    }

    object Themes {
        fun returnTheme(theme: Theme): MutableMap<String, Theme> {
            val map = mutableMapOf<String, Theme>()
            map[theme.name] = theme
            return map
        }
    }

    private fun returnInstance() = Config.getInstance(this)

    fun returnThemeForNameOne(theme: Theme): Theme? {
        val instance = returnInstance()
        themes[theme.name] = instance
        return themes[theme.name]
    }

    fun returnThemeForNameTwo() = Themes.returnTheme(this)

    override fun equals(other: Any?): Boolean {
        val otherObject = other as? Theme ?: return false
        return otherObject.name == name && otherObject.backGroundColor == backGroundColor
                && otherObject.fontColor == fontColor && otherObject.type == type
    }

    override fun hashCode(): Int = name.hashCode() * 31 + backGroundColor.hashCode() + fontColor.hashCode() + type.hashCode()

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("Theme :\n")
            .append("\tName             --> ").append(this.name).append("\n")
            .append("\tBackground color --> ").append(this.backGroundColor).append("\n")
            .append("\tFont color       --> ").append(this.fontColor).append("\n")
            .append("\tType             --> ").append(this.type)

        return sb.toString()
    }

}