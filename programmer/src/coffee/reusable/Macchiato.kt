package coffee.reusable

class Macchiato : Coffee {
    override val name = "macchiato"

    override fun cost(): Double {
        return 1.5
    }
}