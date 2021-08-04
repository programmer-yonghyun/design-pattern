package chocolate

import java.lang.Thread.sleep
import kotlin.concurrent.thread

class LazyChocolateBoiler : ChocolateBoiler {
    companion object : ChocolateBoilerCompanion {
        private var instance: LazyChocolateBoiler? = null
        override fun get(): LazyChocolateBoiler {
            if (instance == null) instance = LazyChocolateBoiler()
            return instance!!
        }
    }

    override fun companion() = EagerChocolateBoiler
}