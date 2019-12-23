package others.liskov.good;

 class Main {

     public static void main(String[] args) {
         Shape shape = new Rectangle(10,10);
         System.out.println(shape.getArea());
         Shape shape1 = new Square(34);
         System.out.println(shape1.getArea());
     }



}
