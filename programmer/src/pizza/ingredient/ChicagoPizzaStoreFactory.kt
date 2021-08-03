package pizza.ingredient

import CheesePizza

class ChicagoPizzaStoreFactory : PizzaStoreFactory() {
    private val pizzaIngredientFactory = ChicagoPizzaIngredientFactory()

    override fun create(type: PizzaType): Pizza {
        return when (type) {
            PizzaType.CHEESE -> CheesePizza(pizzaIngredientFactory, "ChicagoCheesePizza")
            PizzaType.PEPPERONI -> PepperoniPizza(pizzaIngredientFactory, "ChicagoPepperoniPizza")
        }
    }
}