package duck.reusable

fun main() {
    val mapOfDuck =
        listOf(
            "FishDuck" to FishDuck(1),
            "RocketDuck" to RocketDuck(2),
            "BirdDuck" to BirdDuck(3),
        )

    mapOfDuck.forEach { (key, duck) ->
        println("type: $key")
        duck.swim()
        duck.doQuack()
        duck.doFly()
    }
}