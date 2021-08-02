package coffee.noreusable

class Mocha(
    override val shotCount: Int,
    override val whipped: Boolean
) : Coffee {
    override val name = "mocha"

    override fun cost(): Double {
        return 2.5
    }
}