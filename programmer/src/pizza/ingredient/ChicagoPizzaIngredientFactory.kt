package pizza.ingredient

import pizza.ingredient.cheese.Cheese
import pizza.ingredient.dough.Dough
import pizza.ingredient.source.Source
import pizza.ingredient.veggie.Veggie

class ChicagoPizzaIngredientFactory: PizzaIngredientFactory {
    override fun createDough(): Dough {
        TODO("Not yet implemented")
    }

    override fun createSource(): Source {
        TODO("Not yet implemented")
    }

    override fun createCheese(): Cheese {
        TODO("Not yet implemented")
    }

    override fun createVeggies(): List<Veggie> {
        TODO("Not yet implemented")
    }
}