// Represents circles.

public class Circle implements Shape {
   public double radius;
   
   // Constructs a new circle with the given radius.
   public Circle(double radius) {
      this.radius = radius;
   }
   
   // Returns the area of this circle.
   public double area() {
      return Math.PI * radius * radius;
   }
   
   // Returns the perimeter of this circle.
   public double perimeter() {
      return 2.0 * Math.PI * radius;
   }
   
   public void getShape() {
      System.out.println("Circle");
   }
}