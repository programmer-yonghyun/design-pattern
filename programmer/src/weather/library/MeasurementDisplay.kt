package weather.library

import weather.noreusable.WeatherData.Companion.RESET_VALUE
import java.util.*

class MeasurementDisplay(
    private var temperature: Float = RESET_VALUE,
    private var humidity: Float = RESET_VALUE,
    private var pressure: Float = RESET_VALUE,
) : Observer {

    override fun update(subject: Observable, arg: Any?) {
        if (subject is WeatherData) {
            this.temperature = subject.temperature
            this.humidity = subject.humidity
            this.pressure = subject.pressure

            display()
        }
    }

    private fun display() {
        println("measurement {")
        println("   temperature: $temperature")
        println("   humidity: $humidity")
        println("   pressure: $pressure")
        println("}")
    }
}