package coffee.reusable

class Cortado : Coffee {
    override val name = "cortado"

    override fun cost(): Double {
        return 1.5
    }
}