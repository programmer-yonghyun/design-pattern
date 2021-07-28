package weather.reusable

fun main() {
    val weatherData = WeatherData(27f, 60.2f, 20f)

    val forecastDisplay =
        ForecastDisplay(
            weatherData,
            weatherData.temperature,
            weatherData.humidity,
            weatherData.pressure
        )
    val measurementDisplay =
        MeasurementDisplay(
            weatherData,
            weatherData.temperature,
            weatherData.humidity,
            weatherData.pressure
        )

    weatherData.registerObserver(forecastDisplay)
    weatherData.registerObserver(measurementDisplay)
    weatherData.updateObservers()

    weatherData.temperature = 30f
    weatherData.humidity = 68f
    weatherData.pressure = 21f
    weatherData.updateObservers()

    weatherData.unregisterObserver(measurementDisplay)
    weatherData.temperature = 30f
    weatherData.humidity = 68f
    weatherData.pressure = 21f
    weatherData.updateObservers()

}