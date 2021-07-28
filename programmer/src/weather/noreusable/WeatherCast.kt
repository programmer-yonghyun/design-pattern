package weather.noreusable

fun main() {
    val weatherData = WeatherData(27f, 60.2f, 20f)
    weatherData.push()

    weatherData.temperature = 30f
    weatherData.humidity = 68f
    weatherData.pressure = 21f
    weatherData.push()
}