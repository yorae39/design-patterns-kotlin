package bridge.api

import java.io.FileNotFoundException
import java.io.PrintStream

class FileGeneratorHTML : FileGenerator {
    override fun generate(contents: String) {
        try {
            val result = PrintStream("file.html")
            result.println(contents)
            result.close()
            println("File html generated")
        }catch (e: FileNotFoundException) {
            println(e.message)
        }
    }
}