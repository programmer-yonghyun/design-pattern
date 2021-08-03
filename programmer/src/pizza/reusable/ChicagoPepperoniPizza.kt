package pizza.reusable

class ChicagoPepperoniPizza : Pizza {
    override val name = "ChicagoPepperoniPizza"

    override fun prepare() {
        println("$name: prepare")
    }

    override fun bake() {
        println("$name: bake")
    }

    override fun cut() {
        println("$name: cut")
    }
}