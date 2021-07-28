package weather.reusable

class WeatherData(
    var temperature: Float = RESET_VALUE,
    var humidity: Float = RESET_VALUE,
    var pressure: Float = RESET_VALUE,
) : Subject {
    companion object {
        const val RESET_VALUE = 0.0f
    }

    private val observerList = mutableListOf<Observer>()

    override fun registerObserver(observer: Observer) {
        observerList.add(observer)
    }

    override fun unregisterObserver(observer: Observer) {
        observerList.remove(observer)
    }

    override fun updateObservers() {
        observerList.forEach { it.update() }
    }
}