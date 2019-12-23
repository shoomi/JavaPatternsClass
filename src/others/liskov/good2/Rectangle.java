package others.liskov.good2;

class Rectangle implements Shape2 {

   @Override
   public int getArea(int width, int hegth) {
       return hegth* width;
   }
}
