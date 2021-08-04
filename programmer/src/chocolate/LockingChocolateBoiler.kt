package chocolate

class LockingChocolateBoiler : ChocolateBoiler {
    companion object : ChocolateBoilerCompanion {
        @Volatile
        private var instance: SynchronizedChocolateBoiler? = null

        override fun get(): SynchronizedChocolateBoiler {
            if (instance == null)
                synchronized(LockingChocolateBoiler::class) {
                    if (instance == null) instance = SynchronizedChocolateBoiler()
                }
            return instance!!
        }
    }

    override fun companion() = EagerChocolateBoiler
}