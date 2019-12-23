package others.liskov.bad;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(23,343);
        System.out.println(rectangle.getArea());

        Square square = new Square(34,34);
        System.out.println(square.getArea());  // буде нуль
    }
}
