package coffee.reusable

class WhipDecorator(
    override val coffee: Coffee
) : CoffeeDecorator {
    override val name = "whip"
    override val description = coffee.description + name

    override fun cost(): Double {
        return coffee.cost() + WHIP_COST
    }

    companion object {
        const val WHIP_COST = 0.25
    }
}