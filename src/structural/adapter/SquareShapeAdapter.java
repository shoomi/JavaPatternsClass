package structural.adapter;

//унаслідуєм від класу під який хочем адаптуватись та просто овверайдим його метод під свої потреби
public class SquareShapeAdapter extends RoundShape {

    SquareShape squareShape;

    public SquareShapeAdapter(SquareShape squareShape) {
        this.squareShape = squareShape;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((squareShape.getWidth() / 2), 2) * 2));
        return result;
    }

}
