package command.api

class CommandMusicPlayer(
    private val player: Player,
    private val file: String
) : Command {
    override fun execute() {
        try {
            this.player.play(file)
        }catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }
}