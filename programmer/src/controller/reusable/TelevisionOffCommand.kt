package controller.reusable

class TelevisionOffCommand(
    private val television: Television
) : Command {
    override fun execute() {
        television.off()
    }

    override fun undo() {
        television.on()
    }
}