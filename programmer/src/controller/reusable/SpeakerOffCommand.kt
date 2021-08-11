package controller.reusable

class SpeakerOffCommand(
    private val speaker: Speaker
) : Command {
    override fun execute() {
        speaker.off()
    }

    override fun undo() {
        speaker.on()
    }
}