package creational.builder;

public class OldModel extends CarBuilder<Car> {


    @Override
    void setColor() {
        t.setColor("green");
    }

    @Override
    void setEngine() {

    }

    @Override
    void setSpeed() {

    }

    @Override
    boolean turbocharger() {
        return false;
    }

    @Override
    boolean spoiler() {
        return false;
    }
}
