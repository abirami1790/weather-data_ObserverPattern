public class WeatherStats {

    float currentTemperature = 30;
    float currentHumidity = 70;
    float currentPressure = 15;
    float previousTemperature;
    float previousHumidity;
    float previousPressure;

    public void display() {
        System.out.println(currentTemperature > previousTemperature ? "Temperature Increased" : "Temperature Decreased");
        System.out.println(currentHumidity > previousHumidity ? "Humidity Increased" : "Humidity Decreased");
        System.out.println(currentPressure > previousPressure ? "Pressure Increased" : "Pressure Decreased");
    }

    public void update(float temperature, float humidity, float pressure) {
        this.previousTemperature = this.currentTemperature;
        this.previousHumidity = this.currentHumidity;
        this.previousPressure = this.currentPressure;
        this.currentTemperature = temperature;
        this.currentHumidity = humidity;
        this.currentPressure = pressure;
        display();
    }
}
