package duck.nonreusable

fun main() {
    val mapOfDuck =
        listOf(
            "FishDuck" to FishDuck(1),
            "PigDuck" to PigDuck(2),
            "BirdDuck" to BirdDuck(3),
        )

    mapOfDuck.forEach { (key, duck) ->
        println("type: $key")
        duck.swim()
        duck.quack()
        duck.fly()
    }
}