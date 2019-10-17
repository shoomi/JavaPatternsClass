package structural.adapter;

public class RoundShape implements Figure {

    private double radius;

    public RoundShape() {}

    public RoundShape(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
