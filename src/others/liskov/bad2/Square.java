package others.liskov.bad2;

class Square implements Shape {

   @Override
   public int getArea(int heigth, int width) {   // тут height не задіюється
       return width* width;
   }
}
