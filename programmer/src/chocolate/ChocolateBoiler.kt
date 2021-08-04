package chocolate

interface ChocolateBoiler {
    companion object : ChocolateBoilerCompanion {
        override fun get(): ChocolateBoiler = get()
    }

    fun companion(): ChocolateBoilerCompanion
}