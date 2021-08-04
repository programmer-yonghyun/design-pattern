package chocolate

class SynchronizedChocolateBoiler : ChocolateBoiler {
    companion object : ChocolateBoilerCompanion {
        private var instance: SynchronizedChocolateBoiler? = null

        @Synchronized
        override fun get(): SynchronizedChocolateBoiler {
            if (instance == null) instance = SynchronizedChocolateBoiler()
            return instance!!
        }
    }

    override fun companion() = EagerChocolateBoiler
}