package others.liskov.bad2;

class Rectangle implements Shape{

   @Override
   public int getArea(int heigth, int width) {
       return heigth* width;
   }
}
