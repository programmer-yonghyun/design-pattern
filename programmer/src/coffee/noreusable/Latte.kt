package coffee.noreusable

class Latte(
    override val shotCount: Int,
    override val whipped: Boolean
) : Coffee {
    override val name = "latte"

    override fun cost(): Double {
        return 2.0
    }
}