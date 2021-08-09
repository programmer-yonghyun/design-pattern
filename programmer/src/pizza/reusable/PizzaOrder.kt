package pizza.reusable

fun main() {
    val chicagoPizzaStore = ChicagoPizzaStore()
    val newYorkPizzaStore = NewYorkPizzaStore()

    listOf(
        chicagoPizzaStore.order(PizzaType.CHEESE),
        chicagoPizzaStore.order(PizzaType.PEPPERONI),
        newYorkPizzaStore.order(PizzaType.CHEESE),
        newYorkPizzaStore.order(PizzaType.PEPPERONI),
    )
}