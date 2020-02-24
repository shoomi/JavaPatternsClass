package structural.bridge.bridge2;

public class RedColor implements Color {

    Shape shape;
    String redColor = "redColor";

    @Override
    public void setColor(Shape shape) {
        this.shape = shape;
    }

    @Override
    public String getColor() {
        return redColor;
    }
}
