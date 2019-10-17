package structural.adapter;

// клас який треба адаптувати, тут немає методу getRadius
public class SquareShape {

    private double width;

    public SquareShape(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        return Math.pow(this.width, 2);
    }
}
