package command.api

class TurnUpVolumeCommand(
    private val player: Player,
    private val levels: Int
) : Command {
    override fun execute() {
        this.player.increaseVolume(levels)
    }
}