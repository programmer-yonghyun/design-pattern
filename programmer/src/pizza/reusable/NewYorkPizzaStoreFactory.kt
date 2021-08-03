package pizza.reusable

class NewYorkPizzaStoreFactory : PizzaStoreFactory() {
    override fun create(type: PizzaType): Pizza {
        return when (type) {
            PizzaType.CHEESE -> NewYorkCheesePizza()
            PizzaType.PEPPERONI -> NewYorkPepperoniPizza()
        }
    }
}