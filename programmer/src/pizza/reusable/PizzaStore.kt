package pizza.reusable

abstract class PizzaStore {
    fun order(type: PizzaType) {
        val pizza = create(type)

        pizza.prepare()
        pizza.bake()
        pizza.cut()
    }

    abstract fun create(type: PizzaType): Pizza
}