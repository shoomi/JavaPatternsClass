package creational.prototipe;

public class Circle extends Shape {

    public Circle() {
        type = "circle";
    }

    @Override
    void draw() {
        System.out.println("draw circle");
    }
}
