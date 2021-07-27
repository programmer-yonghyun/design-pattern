package duck.nonreusable

class PigDuck(id: Int) : Duck(id) {
    override fun quack() {
        println("I can quack.")
    }

    override fun fly() {
        // TODO cannot fly
    }
}