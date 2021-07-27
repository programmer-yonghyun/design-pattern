package duck.nonreusable

class FishDuck(id: Int) : Duck(id) {
    override fun quack() {
        // TODO cannot quack
    }

    override fun fly() {
        // TODO cannot fly
    }
}