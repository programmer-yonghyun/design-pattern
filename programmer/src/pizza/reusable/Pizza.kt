package pizza.reusable

interface Pizza {
    val name: String

    fun prepare()
    fun bake()
    fun cut()
}