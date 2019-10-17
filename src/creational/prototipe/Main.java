package creational.prototipe;

// дозволяє копіювати об’єкти будь-якої складності без прив’язки до їхніх конкретних класів
public class Main {

    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle();
        Circle circle = new Circle();
        Circle circle1 = (Circle) circle.clone();

        System.out.println(rectangle.type);
        System.out.println(circle.type);
        System.out.println(circle1.type);

    }
}
