package command.api

class CommandList {
    private val commands: MutableList<Command> = mutableListOf()

    fun add(command: Command) {
        this.commands.add(command)
    }

    fun execute() {
        for (command in this.commands) {
            command.execute()
        }
    }

}