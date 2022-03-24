package command.api

class DecreaseVolumeCommand(
    private val player: Player,
    private val levels: Int
): Command {
    override fun execute() {
        this.player.decreaseVolume(levels)
    }
}