package chocolate

class InitChocolateBoiler : ChocolateBoiler {
    companion object : ChocolateBoilerCompanion {
        @JvmStatic
        private val instance: InitChocolateBoiler = InitChocolateBoiler()
        override fun get() = instance
    }

    override fun companion() = EagerChocolateBoiler
}