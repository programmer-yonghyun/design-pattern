package controller.reusable

class TelevisionOnCommand(
    private val television: Television
) : Command {
    override fun execute() {
        television.on()
    }

    override fun undo() {
        television.off()
    }
}