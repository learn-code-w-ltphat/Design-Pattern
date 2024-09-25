import HomeSystem.Light;
import HomeSystem.AirConditioner;
import HomeSystem.Television;
import HomeSystem.Security;

public class HomeControl {
    private Light light;
    private AirConditioner ac;
    private Security security;
    private Television tv;

    public HomeControl(Light light, AirConditioner ac, Security security, Television tv) {
        this.light = light;
        this.ac = ac;
        this.security = security;
        this.tv = tv;
    }

    public void activateAll() {
        System.out.println("Activating all...");
        light.turnOn();
        ac.turnOn();
        tv.turnOn();
        security.activateAlarm();
        security.turnOnCameras();
    }

    public void activateMovieMode(int tvChannel) {
        System.out.println("Setting up Movie Mode...");
        light.dim(10);
        ac.turnOn();
        ac.setTemperature(22);
        tv.turnOn();
        tv.setChannel(tvChannel);
    }

    public void activateSecurityMode() {
        System.out.println("Activating Security Mode...");
        security.lockDoors();
        security.activateAlarm();
        security.turnOnCameras();
    }

    public void deactivateSecurityMode() {
        System.out.println("Deactivating Security Mode...");
        security.deactivateAlarm();
        security.unlockDoors();
        security.turnOffCameras();
    }

    public void turnOffAllSystems() {
        System.out.println("Turning off all systems...");
        light.turnOff();
        ac.turnOff();
        tv.turnOff();
        security.deactivateAlarm();
        security.turnOffCameras();
    }
}
