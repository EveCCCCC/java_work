// Polymorphism Example 2 
// Slide 61 - 66

// Main method for Lamb.java
public class HamMain {
   public static void main(String[] args) {
      Ham[] food = { new Lamb(), new Ham(), new Spam(), new Yam() };
      for (int i = 0; i < food.length; i++) {
         System.out.println(food[i]);
         food[i].a();
         System.out.println();   // to end line of output 
         food[i].b();
         System.out.println();   // to end line of output
         System.out.println();
      }
   }
}