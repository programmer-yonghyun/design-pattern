package controller.nonreusable

class Controller {
    private val firstButton = Light()
    private val secondButton = Speaker()
    private val thirdButton = Television()

    fun buttonPressed(index: Int) {
        when (index) {
            0 -> {
                firstButton.on()
            }
            1 -> {
                secondButton.on()
                secondButton.connect()
            }
            2 -> {
                thirdButton.on()
                thirdButton.volume = 12
            }
        }
    }

    fun buttonDepressed(index: Int) {
        when (index) {
            0 -> {
                firstButton.off()
            }
            1 -> {
                secondButton.off()
            }
            2 -> {
                thirdButton.off()
            }
        }
    }
}