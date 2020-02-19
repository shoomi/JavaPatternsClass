package creational.builder;

public class Car {

    private String color;
    private  int speed;
    private String engine;
    private boolean turbocharger;
    private boolean spoiler;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public boolean isTurbocharger() {
        return turbocharger;
    }

    public void setTurbocharger(boolean turbocharger) {
        this.turbocharger = turbocharger;
    }

    public boolean isSpoiler() {
        return spoiler;
    }

    public void setSpoiler(boolean spoiler) {
        this.spoiler = spoiler;
    }
}
