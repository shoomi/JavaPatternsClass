package others.liskov.good;

 class Square implements Shape {

    private int width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    public int getArea() {
        return this.width*this.width;
    }
}
