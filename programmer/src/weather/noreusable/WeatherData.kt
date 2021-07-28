package weather.noreusable

class WeatherData(
    var temperature: Float = RESET_VALUE,
    var humidity: Float = RESET_VALUE,
    var pressure: Float = RESET_VALUE,
) {
    companion object {
        const val RESET_VALUE = 0.0f
    }

    private val forecastDisplay = ForecastDisplay(temperature, humidity, pressure)
    private val measurementDisplay = MeasurementDisplay(temperature, humidity, pressure)

    fun push() {
        forecastDisplay.update(temperature, humidity, pressure)
        measurementDisplay.update(temperature, humidity, pressure)
    }
}