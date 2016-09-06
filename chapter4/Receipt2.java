import java.util.*;
public class Receipt2 {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      double subtotal = meals(console);
      results(subtotal);
   }
   
   public static double meals(Scanner console) {
      System.out.print("How many people ate? ");
      int people = console.nextInt();
      double subtotal = 0.0;
      for (int count = 1; count <= people; count++) {
         System.out.print("Person #" + count + 
            ": How much did your dinner cost? ");
         double personCost = console.nextDouble();
         subtotal += personCost; 
      }
      return subtotal;
   }
   
   public static void results(double subtotal) {
      double tax = subtotal * 0.08;
      double tip = subtotal * 0.15;
      double total = subtotal + tax + tip;
      System.out.println();
      System.out.println("Subtotal: $" + subtotal);
      System.out.println("Tax: $" + tax);
      System.out.println("Total: $" + total);
   }

}