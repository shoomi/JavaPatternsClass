package others.liskov.good2;

class Square implements Shape1 {

   @Override
   public int getArea(int width) {
       return width*width;
   }
}
