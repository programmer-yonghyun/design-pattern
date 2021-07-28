package weather.library

import weather.noreusable.WeatherData.Companion.RESET_VALUE
import java.util.*

class ForecastDisplay(
    private var temperature: Float = RESET_VALUE,
    private var humidity: Float = RESET_VALUE,
    private var pressure: Float = RESET_VALUE,
) : Observer {
    companion object {
        private const val TEMPERATURE_INCREASE = 1.5f
        private const val HUMIDITY_INCREASE = 1.0f
        private const val PRESSURE_INCREASE = 1.2f
    }

    override fun update(subject: Observable, arg: Any?) {
        if (subject is WeatherData) {
            this.temperature = subject.temperature + TEMPERATURE_INCREASE
            this.humidity = subject.humidity + HUMIDITY_INCREASE
            this.pressure = subject.pressure + PRESSURE_INCREASE

            display()
        }
    }

    private fun display() {
        println("forecast {")
        println("   temperature: $temperature")
        println("   humidity: $humidity")
        println("   pressure: $pressure")
        println("}")
    }


}