package pizza.ingredient

import CheesePizza

class NewYorkPizzaStoreFactory : PizzaStoreFactory() {
    private val pizzaIngredientFactory = NewYorkPizzaIngredientFactory()

    override fun create(type: PizzaType): Pizza {
        return when (type) {
            PizzaType.CHEESE -> CheesePizza(pizzaIngredientFactory, "NewYorkCheesePizza")
            PizzaType.PEPPERONI -> PepperoniPizza(pizzaIngredientFactory, "NewYorkPepperoniPizza")
        }
    }
}