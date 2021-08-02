package coffee.reusable

class ShotDecorator(
    override val coffee: Coffee
) : CoffeeDecorator {
    override val name = "shot"
    override val description = coffee.description + name

    override fun cost(): Double {
        return coffee.cost() + SHOT_COST
    }

    companion object {
        const val SHOT_COST = 0.5
    }
}