package pizza.reusable

class ChicagoPizzaStoreFactory : PizzaStoreFactory() {
    override fun create(type: PizzaType): Pizza {
        return when (type) {
            PizzaType.CHEESE -> ChicagoCheesePizza()
            PizzaType.PEPPERONI -> ChicagoPepperoniPizza()
        }
    }
}