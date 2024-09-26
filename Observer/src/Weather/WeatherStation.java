package Weather;

import Display.Display;

public interface WeatherStation {
    void registerObserver(Display observer);
    void removeObserver(Display observer);
    void notifyObservers();
}
