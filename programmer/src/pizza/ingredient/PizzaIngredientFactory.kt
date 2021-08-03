package pizza.ingredient

import pizza.ingredient.cheese.Cheese
import pizza.ingredient.dough.Dough
import pizza.ingredient.source.Source
import pizza.ingredient.veggie.Veggie

interface PizzaIngredientFactory {
    fun createDough(): Dough
    fun createSource(): Source
    fun createCheese(): Cheese
    fun createVeggies(): List<Veggie>
}