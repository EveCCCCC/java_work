
public class Point {
   private int x;
   private int y;
   
   public Point(int initialX, int initialY) {
      x = initialX;
      y = initialY;
   }
   
   public int getX() {
      return x;
   }
   
   public int getY() {
      return y;
   }
   public void translate(int dx, int dy) {
      x = x + dx;
      y = y + dy;
   }
}