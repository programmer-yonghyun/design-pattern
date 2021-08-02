package coffee.reusable

class Espresso : Coffee {
    override val name = "espresso"

    override fun cost(): Double {
        return 1.0
    }
}