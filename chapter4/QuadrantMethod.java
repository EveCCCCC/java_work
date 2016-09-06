public class QuadrantMethod {
   public static void main(String[] args) {
      Quadrant(3, -9);
      Quadrant(3, 0);
   }

   public static void Quadrant(int x, int y) {
      int quadrant = 0;
      if (x > 0 && y > 0) {
         quadrant = 1;
      } else if (x < 0 && y > 0) {
         quadrant = 2;
      } else if (x < 0 && y < 0) {
         quadrant = 3;
      } else if (x > 0 && y < 0) {
         quadrant = 4;
      } 
      System.out.println("The point (" + x + "," + y + 
         ") lies in Quadrant " + quadrant); 
   }
   
}