package coffee.noreusable

fun main() {
    val coffees =
        listOf(
            Cortado(0, true),
            Espresso(2, true),
            Latte(1, false),
            Macchiato(1, true),
            Mocha(0, false)
        )

    coffees.forEach {
        println(it.description)
        println(it.costByOther())
    }
}