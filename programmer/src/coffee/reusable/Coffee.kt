package coffee.reusable

interface Coffee {
    val name: String
    val description: List<Any>
        get() = listOf(name)

    fun cost(): Double
}