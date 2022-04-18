package behaviour.mediator.without_mediator;

public class Button {
    private Fan fan = new Fan();

    // constructor, getters and setters

    public void press(){
        if(fan.isOn()){
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    public Fan getFan() {
        return fan;
    }
}
