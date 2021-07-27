package duck.nonreusable

abstract class Duck(val id: Int) {
    fun swim() {
        println("I can swim.")
    }

    abstract fun quack()
    abstract fun fly()
}