package flyweight.main

import flyweight.api.Presentation
import flyweight.api.Slide
import flyweight.api.ThemeFlyweightFactory

fun main() {
    testThemes()
}

fun testThemes() {
    val presentation = Presentation()
    val slideA = ThemeFlyweightFactory().getTheme(ThemeFlyweightFactory().CORPORATE)
        ?.let { Slide(it, "LPA ENTERPRISE", "Smart business technologies company") }

    val slideB = ThemeFlyweightFactory().getTheme(ThemeFlyweightFactory().ASTERISK)
        ?.let { Slide(it, "LPA ENTERPRISE", "Smart business technologies company") }

    val slideC = ThemeFlyweightFactory().getTheme(ThemeFlyweightFactory().HYPHEN)
        ?.let { Slide(it, "LPA ENTERPRISE", "Smart business technologies company") }

    if (slideA != null && slideB != null && slideC != null) {
        presentation.addSlide(slideA)
        presentation.addSlide(slideB)
        presentation.addSlide(slideC)
    }
    presentation.print()
}