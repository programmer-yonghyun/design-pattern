package controller.nonreusable

class Television {
    var volume = 0
        set(value) {
            println("Set the volume of television to $value")
            field = value
        }

    fun on() {
        println("On the television.")
    }

    fun off() {
        println("Off the television.")
    }
}