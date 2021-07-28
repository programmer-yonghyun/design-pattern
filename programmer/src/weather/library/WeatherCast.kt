package weather.library

fun main() {
    val weatherData = WeatherData(27f, 60.2f, 20f)

    val forecastDisplay = ForecastDisplay(weatherData.temperature, weatherData.humidity, weatherData.pressure)
    val measurementDisplay = MeasurementDisplay(weatherData.temperature, weatherData.humidity, weatherData.pressure)

    weatherData.addObserver(forecastDisplay)
    weatherData.addObserver(measurementDisplay)
    weatherData.notifyObservers()

    weatherData.temperature = 30f
    weatherData.humidity = 68f
    weatherData.pressure = 21f
    weatherData.notifyObservers()

    weatherData.deleteObserver(measurementDisplay)
    weatherData.temperature = 30f
    weatherData.humidity = 68f
    weatherData.pressure = 21f
    weatherData.notifyObservers()

}