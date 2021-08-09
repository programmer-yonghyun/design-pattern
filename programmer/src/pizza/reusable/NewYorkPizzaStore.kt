package pizza.reusable

class NewYorkPizzaStore : PizzaStore() {
    override fun create(type: PizzaType): Pizza {
        return when (type) {
            PizzaType.CHEESE -> NewYorkCheesePizza()
            PizzaType.PEPPERONI -> NewYorkPepperoniPizza()
        }
    }
}