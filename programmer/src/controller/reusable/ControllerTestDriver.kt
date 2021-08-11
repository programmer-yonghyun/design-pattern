package controller.reusable

fun main() {
    val controller = Controller()

    val light = Light()
    val speaker = Speaker()
    val television = Television()

    controller.setCommand(
        index = 0,
        onCommand = LightOnCommand(light),
        offCommand = LightOffCommand(light)
    )

    controller.setCommand(
        index = 1,
        onCommand = SpeakerOnCommand(speaker),
        offCommand = SpeakerOffCommand(speaker)
    )

    controller.setCommand(
        index = 2,
        onCommand = TelevisionOnCommand(television),
        offCommand = TelevisionOffCommand(television)
    )

    controller.buttonPressed(0)
    controller.buttonPressed(1)
    controller.undoButtonPressed()
    controller.buttonPressed(2)
    controller.buttonDepressed(0)
    controller.buttonDepressed(1)
    controller.undoButtonPressed()
    controller.buttonDepressed(2)
}