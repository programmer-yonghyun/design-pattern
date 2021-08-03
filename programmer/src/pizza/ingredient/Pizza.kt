package pizza.ingredient

import pizza.ingredient.cheese.Cheese
import pizza.ingredient.dough.Dough
import pizza.ingredient.source.Source
import pizza.ingredient.veggie.Veggie

abstract class Pizza {
    abstract val name: String
    var dough: Dough? = null
    var source: Source? = null
    var cheese: Cheese? = null
    var veggies: List<Veggie>? = null

    abstract fun prepare()

    fun bake() {
        println("$name: bake")
    }

    fun cut() {
        println("$name: cut")
    }
}