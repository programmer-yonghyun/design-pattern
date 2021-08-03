package pizza.reusable

abstract class PizzaStoreFactory {
    fun order(type: PizzaType) {
        val pizza = create(type)

        pizza.prepare()
        pizza.bake()
        pizza.cut()
    }

    abstract fun create(type: PizzaType): Pizza
}