package duck.reusable

import duck.reusable.fly.FlyBehavior
import duck.reusable.fly.FlyWithWing
import duck.reusable.quack.MuteQuack
import duck.reusable.quack.QuackBehavior

class BirdDuck(id: Int) : Duck(id) {
    override val flyBehavior: FlyBehavior = FlyWithWing()
    override val quackBehavior: QuackBehavior = MuteQuack()
}