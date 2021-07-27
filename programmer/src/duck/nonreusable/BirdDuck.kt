package duck.nonreusable

class BirdDuck(id: Int) : Duck(id) {
    override fun quack() {
        // TODO cannot quack
    }

    override fun fly() {
        println("I can fly.")
    }
}