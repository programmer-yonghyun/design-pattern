package duck.reusable

import duck.reusable.fly.FlyBehavior
import duck.reusable.quack.QuackBehavior

abstract class Duck(val id: Int) {
    abstract val flyBehavior: FlyBehavior
    abstract val quackBehavior: QuackBehavior

    fun swim() {
        println("I can swim.")
    }

    fun doQuack() {
        quackBehavior.quack()
    }

    fun doFly() {
        flyBehavior.fly()
    }
}