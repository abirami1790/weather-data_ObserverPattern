public class CurrentConditions {

    float temperature;
    float humidity;
    float pressure;

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    private void display() {
        System.out.println("Temperature : " + temperature);
        System.out.println("Humidity : " + humidity);
        System.out.println("Pressure : " + pressure);
    }
}
