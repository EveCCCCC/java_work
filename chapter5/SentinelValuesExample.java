import java.util.*;
public class SentinelValuesExample {
     
   public static final int SENTINEL = -1;
   public static void main(String[] args) {

      Scanner console = new Scanner(System.in);
      int number = 1;
      int sum = 0;
      
      System.out.print("Enter a number (" + SENTINEL + " to quit): ");
      number = console.nextInt();
      
      while (number != SENTINEL) {
         sum += number;
         System.out.print("Enter a number (" + SENTINEL + " to quit): ");
         number = console.nextInt();
      }
      
      System.out.println("The total is " + sum); 
   }

}