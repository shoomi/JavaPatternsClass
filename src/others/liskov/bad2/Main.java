package others.liskov.bad2;

class Main {

    public static void main(String[] args) {
        Shape shape = new Rectangle();
        System.out.println(shape.getArea(10,10));
        Shape shape1 = new Square();
        System.out.println(shape1.getArea(32,32));
    }



}
