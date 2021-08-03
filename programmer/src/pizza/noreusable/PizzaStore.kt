package pizza.noreusable

class PizzaStore {
    fun order(
        state: String,
        type: String,
    ): Pizza {
        val pizza =
            if (state == "Chicago") {
                if (type == "Cheese") {
                    ChicagoCheesePizza()
                } else throw IllegalArgumentException("type")
            } else if (state == "NewYork") {
                if (type == "Cheese") {
                    NewYorkCheesePizza()
                } else throw IllegalArgumentException("type")
            } else throw IllegalArgumentException("state")

        pizza.prepare()
        pizza.bake()
        pizza.cut()

        return pizza
    }
}