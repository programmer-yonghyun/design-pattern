package weather.noreusable

import weather.noreusable.WeatherData.Companion.RESET_VALUE

class MeasurementDisplay(
    private var temperature: Float = RESET_VALUE,
    private var humidity: Float = RESET_VALUE,
    private var pressure: Float = RESET_VALUE,
) {

    fun update(
        temperature: Float,
        humidity: Float,
        pressure: Float,
    ) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure

        display()
    }

    private fun display() {
        println("measurement {")
        println("   temperature: $temperature")
        println("   humidity: $humidity")
        println("   pressure: $pressure")
        println("}")
    }
}