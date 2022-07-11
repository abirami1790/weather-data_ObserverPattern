public class WeatherStation {
    public static void main(String args[]) {
        WeatherData weatherData = new WeatherData(new CurrentConditions(), new WeatherStats());
        weatherData.dataChanged();
    }
}
