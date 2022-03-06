package bridge.api

import java.io.FileNotFoundException
import java.io.PrintStream

class FileGeneratorTXT : FileGenerator {

    override fun generate(contents: String) {
        try {
            val result = PrintStream("file.txt")
            result.println(contents)
            result.close()
            println("File txt generated")
        }catch (e: FileNotFoundException) {
            println(e.message)
        }
    }
}