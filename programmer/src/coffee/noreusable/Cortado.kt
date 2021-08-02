package coffee.noreusable

class Cortado(
    override val shotCount: Int,
    override val whipped: Boolean,
) : Coffee {
    override val name = "cortado"

    override fun cost(): Double {
        return 1.5
    }
}