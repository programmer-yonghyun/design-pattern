package duck.reusable

import duck.reusable.fly.FlyBehavior
import duck.reusable.fly.NowayFly
import duck.reusable.quack.Quack
import duck.reusable.quack.QuackBehavior

class FishDuck(id: Int) : Duck(id) {
    override val flyBehavior: FlyBehavior = NowayFly()
    override val quackBehavior: QuackBehavior = Quack()
}