public class WeatherData {

    float temperature;
    float humidity;
    float pressure;
    CurrentConditions currentConditions;
    WeatherStats weatherStats;

    public WeatherData(CurrentConditions currentConditions, WeatherStats weatherStats) {
        this.currentConditions = currentConditions;
        this.weatherStats = weatherStats;
    }

    private float getLatestTemperature()
    {
        return 45;
    }

    private float getLatestHumidity()
    {
        return 60;
    }

    private float getLatestPressure()
    {
        return (float) 10.2;
    }

    public void dataChanged(){
        temperature = getLatestTemperature();
        humidity = getLatestHumidity();
        pressure = getLatestPressure();

        currentConditions.update(temperature, humidity, pressure);
        weatherStats.update(temperature, humidity, pressure);
    }
}
