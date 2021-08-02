package coffee.noreusable

interface Coffee {
    val name: String
    val description: List<Any>
        get() =
            if (whipped) listOf(name) +
                    (1..shotCount).map { "shot" } +
                    "whipped"
            else listOf(name) +
                    (1..shotCount).map { "shot" }


    val shotCount: Int
    val shotCost: Double
        get() = 0.25

    val whipped: Boolean
    val wippedCost: Double
        get() = 0.5

    fun costByOther(): Double {
        return cost() +
                shotCost * shotCount +
                if (whipped) wippedCost else 0.0
    }

    fun cost(): Double
}