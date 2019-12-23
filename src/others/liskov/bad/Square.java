package others.liskov.bad;

public class Square extends Rectangle {
    private int width;  // тут це значення не візьметься

    Square(int width, int hegth) {
        super(width, hegth);
        this.width = hegth;
    }

    public int getArea() {
        return this.width* this.width;
    }
}
