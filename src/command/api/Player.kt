package command.api

class Player {

    @Throws(InterruptedException::class)
    fun play(fileName: String) {
        println("Playing the file: $fileName")
        val duration = Math.random() * 2000
        println("Duration(s) : ${duration/1000}")
        Thread.sleep(duration.toLong())
        println("End")
        println()
    }

    fun increaseVolume(levels: Int) {
        println("Increasing volume in : $levels")
    }

    fun decreaseVolume(levels: Int) {
        println("Decrease volume in : $levels")
    }
}