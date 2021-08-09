package pizza.reusable

class ChicagoPizzaStore : PizzaStore() {
    override fun create(type: PizzaType): Pizza {
        return when (type) {
            PizzaType.CHEESE -> ChicagoCheesePizza()
            PizzaType.PEPPERONI -> ChicagoPepperoniPizza()
        }
    }
}