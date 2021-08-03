package pizza.ingredient

class PepperoniPizza(
    private val ingredientFactory: PizzaIngredientFactory,
    override val name: String,
) : Pizza() {
    override fun prepare() {
        dough = ingredientFactory.createDough()
        source = ingredientFactory.createSource()
        cheese = ingredientFactory.createCheese()
        veggies = ingredientFactory.createVeggies()

        println("$name: prepare")
    }
}