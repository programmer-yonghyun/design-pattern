package pizza.noreusable

class ChicagoCheesePizza : Pizza {
    override val name = "ChicagoCheesePizza"

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