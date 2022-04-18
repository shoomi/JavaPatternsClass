package behaviour.mediator.with_mediator;

public class ButtonMediator implements Mediator {
    Fan fan = new Fan();

    @Override
    public void press() {
        if (fan.isOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    @Override
    public Fan getFan() {
        return fan;
    }
}
