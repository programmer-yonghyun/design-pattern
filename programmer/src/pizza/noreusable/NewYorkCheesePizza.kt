package pizza.noreusable

class NewYorkCheesePizza : Pizza {
    override val name = "NewYorkCheesePizza"

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