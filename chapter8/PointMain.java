public class PointMain {
   public static void main(String[] args) {
      // Create two point objects 
      Point p1 = new Point(5, 2);
      Point p2 = new Point(4, 3);
      
      System.out.println("p1: " + "(" + p1.getX() + ", " + p1.getY() +
         ")");
      System.out.println("p2: " + "(" + p2.getX() + ", " + p2.getY() +
         ")");
      
      p2.translate(2, 4);
      System.out.println("p2: " + "(" + p2.getX() + ", " + p2.getY() +
         ")");

            
      }
}