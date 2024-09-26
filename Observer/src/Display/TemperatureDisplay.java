package Display;

public class TemperatureDisplay implements Display {
    private final String name;

    public TemperatureDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature) {
        System.out.println(name + " display: The current temperature is " + temperature + " degrees Celsius.");
    }
}
