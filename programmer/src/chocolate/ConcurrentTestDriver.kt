package chocolate

import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import kotlin.reflect.KClass
import kotlin.reflect.full.companionObjectInstance
import kotlin.system.measureNanoTime

fun main() {
    var count = 0
    do {
        ConcurrentTestDriver.drive(InitChocolateBoiler::class)
        ConcurrentTestDriver.drive(EagerChocolateBoiler::class)
        ConcurrentTestDriver.drive(LazyChocolateBoiler::class)
        ConcurrentTestDriver.drive(SynchronizedChocolateBoiler::class)
        ConcurrentTestDriver.drive(LockingChocolateBoiler::class)
    } while (count++ < 1024)
}

object ConcurrentTestDriver {
    fun drive(kBoiler: KClass<out ChocolateBoiler>) {
        val executor = Executors.newFixedThreadPool(16)

        val hashSet = ConcurrentHashMap.newKeySet<ChocolateBoiler>()

        val timestamp =
            measureNanoTime {
                (0..64).map {
                    executor
                        .execute {
                            val boiler = (kBoiler.companionObjectInstance as ChocolateBoilerCompanion).get()
                            hashSet.add(boiler)
                        }
                }
            }

        executor.shutdown()

        while (!executor.awaitTermination(50, TimeUnit.MILLISECONDS)) Thread.sleep(50)

        println("${kBoiler.simpleName} => $timestamp")

        if (hashSet.size > 1) throw ExceptionInInitializerError()
    }
}
