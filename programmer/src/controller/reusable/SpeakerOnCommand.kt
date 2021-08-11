package controller.reusable

class SpeakerOnCommand(
    private val speaker: Speaker
) : Command {
    override fun execute() {
        speaker.on()
    }

    override fun undo() {
        speaker.off()
    }
}