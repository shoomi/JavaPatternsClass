package structural.adapter;

// Дає змогу об’єктам із несумісними інтерфейсами працювати разом
public class Main {

    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(30);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(new SquarePeg(34));
        System.out.println(roundHole.fits(squarePegAdapter));
    }
}
