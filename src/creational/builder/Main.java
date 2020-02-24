package creational.builder;


// використовуєм, якщо у нас є обєкт, який можна по різному зібрати не використовуючи всіх його сетерів
// варіанти зборки обєктів визначає директор використовуючи абстракті методи білдера базового класу
public class Main {

    public static void main(String[] args) {

        CarBuilder sport = new SportModel();
        sport.createInstance(Car.class);

        Director director = new Director(sport);

        director.buidSportCar();
        Car car = (Car) director.carBuilder.getCar();

        System.out.println(car.getColor());
    }
}
