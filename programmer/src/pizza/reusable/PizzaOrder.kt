package pizza.reusable

fun main() {
    val chicagoPizzaStore = ChicagoPizzaStoreFactory()
    val newYorkPizzaStore = NewYorkPizzaStoreFactory()

    listOf(
        chicagoPizzaStore.order(PizzaType.CHEESE),
        chicagoPizzaStore.order(PizzaType.PEPPERONI),
        newYorkPizzaStore.order(PizzaType.CHEESE),
        newYorkPizzaStore.order(PizzaType.PEPPERONI),
    )
}