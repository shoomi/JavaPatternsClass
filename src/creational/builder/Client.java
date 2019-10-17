package creational.builder;

public class Client {

    public static void main(String[] args) {

        CarBuilder sport = new SportModel();
        sport.createInstance(Car.class);

        Director director = new Director(sport);

        director.buidSportCar();
        Car car = (Car) director.carBuilder.getCar();

        System.out.println(car.getColor());
    }

}
