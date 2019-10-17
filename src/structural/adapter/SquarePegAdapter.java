package structural.adapter;

//унаслідуєм від класу під який хочем адаптуватись та просто овверайдим його метод під свої потреби
public class SquarePegAdapter extends RoundPeg {

    SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2));
        return result;
    }

}
