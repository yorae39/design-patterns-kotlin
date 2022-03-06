package bridge.main

import bridge.api.FileGeneratorHTML
import bridge.api.FileGeneratorTXT
import bridge.api.Receipt

fun main() {
    testFileGenerateClassTXT()
    testFileGenerateClassHTML()
    //testFileGeneratorTXT()
    //testFileGeneratorHTML()
}

fun testFileGenerateClassTXT() {
    val fileGenerator = FileGeneratorTXT()
    val receipt = Receipt(
        issuer = "Luiz Paulo",
        favoured = "UDEMY",
        value = 27.90,
        fileGenerator
    )

    receipt.fileGenerator()
}

fun testFileGenerateClassHTML() {
    val fileGenerator = FileGeneratorHTML()
    val receipt = Receipt(
        issuer = "Luiz Paulo",
        favoured = "UDEMY",
        value = 27.90,
        fileGenerator
    )

    receipt.fileGenerator()
}

fun testFileGenerateTXT() {
    val fileGeneratorTXT = FileGeneratorTXT()
    val receipt = Receipt(
        issuer = "LPA",
        favoured = "UDEMY",
        value = 27.90,
        fileGeneratorTXT
    )

    receipt.fileGenerator.generate("Test of Luiz Paulo for txt")
}

fun testFileGeneratorHTML() {
    val fileGeneratorHTML = FileGeneratorHTML()
    val receipt = Receipt(
        issuer = "LPA",
        favoured = "UDEMY",
        value = 27.90,
        fileGeneratorHTML
    )

    receipt.fileGenerator.generate("<!DOCTYPE html>\n" +
            "<html lang=\"PT\">\n" +
            "<head>\n" +
            "    <title>Test of Luiz paulo</title>\n" +
            "    <meta charset=\"utf-8\"/>\n" +
            "</head>\n" +
            "<body>\n" +
            "<p>Hello World</p>"+
            "\n" +
            "</body>\n" +
            "</html>")
}