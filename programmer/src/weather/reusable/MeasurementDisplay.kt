package weather.reusable

import weather.noreusable.WeatherData.Companion.RESET_VALUE

class MeasurementDisplay(
    private val data: WeatherData,
    private var temperature: Float = RESET_VALUE,
    private var humidity: Float = RESET_VALUE,
    private var pressure: Float = RESET_VALUE,
) : Observer {

    override fun update() {
        this.temperature = data.temperature
        this.humidity = data.humidity
        this.pressure = data.pressure

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