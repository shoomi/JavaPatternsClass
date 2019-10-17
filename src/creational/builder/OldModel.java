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
}
