package structural.adapter;

// Дає змогу об’єктам із несумісними інтерфейсами працювати разом
// просто створюєм адаптер який буде адаптуватись до потрібного інтерфейсу, в якому ми перевизначим необхідний метод
// в тому методі будем використовувати функціонал класу, який ми адаптуєм
public class Main {

    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(30);
        SquareShapeAdapter squarePegAdapter = new SquareShapeAdapter(new SquareShape(34));
        System.out.println(roundHole.fits(squarePegAdapter));
    }
}
