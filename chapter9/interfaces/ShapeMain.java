public class ShapeMain {
   public static void main(String[] args) {
      Circle circ = new Circle(12.0);
      Rectangle rect = new Rectangle(4, 7);
      Triangle tri = new Triangle(5, 12, 13);
      Shape[] shapes = { circ, rect, tri };
      
      // Print shapes info.
      for (int i = 0; i < shapes.length; i++) {
         printInfo(shapes[i]);
      }
   }
   
   public static void printInfo (Shape s) {
      s.getShape();
      System.out.println("Area: " + s.area());
      System.out.println("Perimeter: " + s.perimeter());
      System.out.println();
   }
}