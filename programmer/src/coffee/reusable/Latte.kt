package coffee.reusable

class Latte : Coffee {
    override val name = "latte"

    override fun cost(): Double {
        return 2.0
    }
}