package creational.builder;

public class SportModel extends CarBuilder<Car> {

    @Override
    void setColor() {
        t.setColor("red");
    }

    @Override
    void setEngine() {
        t.setEngine("12 celinders");
    }

    @Override
    void setSpeed() {
        t.setSpeed(210);
    }
}
