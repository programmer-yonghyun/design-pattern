package coffee.noreusable

class Macchiato(
    override val shotCount: Int,
    override val whipped: Boolean
) : Coffee {
    override val name = "macchiato"

    override fun cost(): Double {
        return 1.5
    }
}