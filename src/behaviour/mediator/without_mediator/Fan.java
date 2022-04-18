package behaviour.mediator.without_mediator;

public class Fan {
    private boolean isOn = false;

    // constructor, getters and setters

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }
}
