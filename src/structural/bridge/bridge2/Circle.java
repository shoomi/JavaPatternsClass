package structural.bridge.bridge2;

public class Circle implements Shape {

    Color color;

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    public String getColor() {
        return this.color.getColor();
    }
}
