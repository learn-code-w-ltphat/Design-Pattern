package Weather;

import Display.Display;

import java.util.ArrayList;
import java.util.List;

public class SimpleWeatherStation implements WeatherStation {
    private final List<Display> observers = new ArrayList<Display>();
    private float temperature;

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void registerObserver(Display observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Display observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Display observer : observers) {
            observer.update(temperature);
        }
    }
}
