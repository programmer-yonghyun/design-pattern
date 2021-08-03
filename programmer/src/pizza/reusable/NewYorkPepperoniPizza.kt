package pizza.reusable

class NewYorkPepperoniPizza : Pizza {
    override val name = "NewYorkPepperoniPizza"

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