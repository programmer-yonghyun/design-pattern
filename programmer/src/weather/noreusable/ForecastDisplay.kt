package weather.noreusable

import weather.noreusable.WeatherData.Companion.RESET_VALUE

class ForecastDisplay(
    private var temperature: Float = RESET_VALUE,
    private var humidity: Float = RESET_VALUE,
    private var pressure: Float = RESET_VALUE,
) {
    companion object {
        private const val TEMPERATURE_INCREASE = 1.5f
        private const val HUMIDITY_INCREASE = 1.0f
        private const val PRESSURE_INCREASE = 1.2f
    }

    fun update(
        temperature: Float,
        humidity: Float,
        pressure: Float,
    ) {
        this.temperature = temperature + TEMPERATURE_INCREASE
        this.humidity = humidity + HUMIDITY_INCREASE
        this.pressure = pressure + PRESSURE_INCREASE

        display()
    }

    private fun display() {
        println("forecast {")
        println("   temperature: $temperature")
        println("   humidity: $humidity")
        println("   pressure: $pressure")
        println("}")
    }
}