package pizza.noreusable

fun main() {
    val pizzaStore = PizzaStore()

    listOf(
        pizzaStore.order("Chicago", "Cheese"),
        pizzaStore.order("NewYork", "Cheese"),
    )
}