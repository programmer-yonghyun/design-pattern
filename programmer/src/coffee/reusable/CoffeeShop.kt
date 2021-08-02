package coffee.reusable

fun main() {
    val coffees =
        listOf(
            ShotDecorator(
                ShotDecorator(
                    Cortado()
                )
            ),
            WhipDecorator(
                ShotDecorator(
                    Espresso()
                )
            ),
            ShotDecorator(
                WhipDecorator(
                    Latte()
                )
            ),
            WhipDecorator(
                WhipDecorator(
                    Macchiato()
                )
            ),
            Mocha()
        )

    coffees.forEach {
        println(it.description)
        println(it.cost())
    }
}