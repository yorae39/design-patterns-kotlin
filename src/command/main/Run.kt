package command.main

import command.api.CommandList
import command.api.CommandMusicPlayer
import command.api.DecreaseVolumeCommand
import command.api.Player
import command.api.TurnUpVolumeCommand

fun main() {
    testCommandList()
}

fun testCommandList() {
    val player = Player()
    val listCommands = CommandList()
    listCommands.add(CommandMusicPlayer(player, "music1.mp3"))
    listCommands.add(TurnUpVolumeCommand(player, 3))
    listCommands.add(CommandMusicPlayer(player, "music2.mp3"))
    listCommands.add(DecreaseVolumeCommand(player, 3))
    listCommands.add(CommandMusicPlayer(player, "music3.mp3"))

    listCommands.execute()
}