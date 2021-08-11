package controller.nonreusable

fun main() {
    val controller = Controller()

    controller.buttonPressed(0)
    controller.buttonPressed(1)
    controller.buttonPressed(2)
    controller.buttonDepressed(0)
    controller.buttonDepressed(1)
    controller.buttonDepressed(2)
}