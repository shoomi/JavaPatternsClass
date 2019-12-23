package others.liskov.good2;

class Main {

    public static void main(String[] args) {
        Shape2 shape = new Rectangle();
        System.out.println(shape.getArea(10,10));
        Shape1 shape1 = new Square();
        System.out.println(shape1.getArea(34));
    }



}
