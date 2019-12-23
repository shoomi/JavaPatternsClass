package others.liskov.good;

 class Rectangle implements Shape{

    private int width;
    private int hegth;

    Rectangle(int width, int hegth) {
        this.width = width;
        this.hegth = hegth;
    }

    @Override
    public int getArea() {
        return this.hegth* this.width;
    }
}
