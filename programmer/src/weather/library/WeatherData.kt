package weather.library

import java.util.*

class WeatherData : Observable {
    var temperature: Float
        set(value) {
            field = value
            setChanged()
        }
    var humidity: Float
        set(value) {
            field = value
            setChanged()
        }
    var pressure: Float
        set(value) {
            field = value
            setChanged()
        }

    constructor(
        temperature: Float = RESET_VALUE,
        humidity: Float = RESET_VALUE,
        pressure: Float = RESET_VALUE
    ) : super() {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
    }

    companion object {
        const val RESET_VALUE = 0.0f
    }
}