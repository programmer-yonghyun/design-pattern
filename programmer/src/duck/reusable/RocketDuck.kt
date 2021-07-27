package duck.reusable

import duck.reusable.fly.FlyBehavior
import duck.reusable.fly.FlyWithEngine
import duck.reusable.quack.MuteQuack
import duck.reusable.quack.QuackBehavior

class RocketDuck(id: Int) : Duck(id) {
    override val flyBehavior: FlyBehavior = FlyWithEngine()
    override val quackBehavior: QuackBehavior = MuteQuack()
}