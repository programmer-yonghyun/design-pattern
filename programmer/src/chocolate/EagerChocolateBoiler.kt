package chocolate

class EagerChocolateBoiler : ChocolateBoiler {
    companion object : ChocolateBoilerCompanion {
        private val instance: EagerChocolateBoiler = EagerChocolateBoiler()
        override fun get() = instance
    }

    override fun companion() = Companion
}