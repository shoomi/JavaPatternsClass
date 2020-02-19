package creational.builder;

public class Director {

    public CarBuilder carBuilder;

    public Director(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void buidSportCar() {
        carBuilder.setEngine();
        carBuilder.setColor();
        carBuilder.setSpeed();
        carBuilder.turbocharger();
        carBuilder.spoiler();
    }

    public void buildOldCar() {
        carBuilder.setEngine();
        carBuilder.setColor();
        carBuilder.setSpeed();
    }

    public void buidOldCar() {
        carBuilder.setColor();
    }

}
