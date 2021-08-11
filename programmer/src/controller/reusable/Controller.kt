package controller.reusable

class Controller {
    private val onCommands: MutableList<Command> = mutableListOf()
    private val offCommands: MutableList<Command> = mutableListOf()
    private lateinit var undoCommand: Command

    fun setCommand(index: Int, onCommand: Command, offCommand: Command) {
        onCommands.add(index, onCommand)
        offCommands.add(index, offCommand)
    }

    fun buttonPressed(index: Int) {
        onCommands[index].execute()
        undoCommand = onCommands[index]
    }

    fun buttonDepressed(index: Int) {
        offCommands[index].execute()
        undoCommand = offCommands[index]
    }

    fun undoButtonPressed() {
        undoCommand.undo()
    }
}