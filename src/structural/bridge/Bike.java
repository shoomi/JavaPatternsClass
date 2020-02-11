package structural.bridge;

public class Bike extends Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Manufactoring Bike...");
        workshops.stream().forEach(workshop -> workshop.work(this)); // метод worshop буде юзати метод minWorkTime цього класу
        System.out.println("Done.");
        System.out.println();
    }
    @Override
    public int minWorkTime() {
        return 5;
    }
}
