// Polymorphism Example 2
// Slide 61 - 66

// Class #4
public class Yam extends Lamb {
   public void a() {
      System.out.print("Yam a    ");
      super.a();
   }
   
   public String toString() {
      return "Yam";
   }
}