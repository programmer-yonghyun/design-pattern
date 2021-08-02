package coffee.noreusable

class Espresso(
    override val shotCount: Int,
    override val whipped: Boolean
) : Coffee {
    override val name = "espresso"

    override fun cost(): Double {
        return 1.0
    }
}

