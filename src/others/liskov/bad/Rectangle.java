package others.liskov.bad;

public class Rectangle {

    private int width;
    private int hegth;

    Rectangle(int width, int hegth) {
        this.width = width;
        this.hegth = hegth;
    }

    public int getArea() {
        return this.width* this.hegth;
    }

}
