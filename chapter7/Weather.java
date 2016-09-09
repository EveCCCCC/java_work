// Reads temperatures from the user, computes the average and 
// # days above average.
import java.util.*;  

public class Weather {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.print("How many days' temperature? ");
      int days = console.nextInt();
      
      int[] temps = new int[days];  // array to store day's temperature
      int sum = 0;
      
      for (int i = 0; i < days; i++) {
         System.out.print("Day " + (i + 1) + "'s high temp: ");
         temps[i] = console.nextInt();
         sum += temps[i];
      }
     
      double average = sum / days;
      int count = 0;                // see if each day is above average
      for (int i = 0; i < days; i++) {
         if (temps[i] > average) {
            count++;
         }
      }
      // report results
      System.out.printf("%.1f\n", average);
      System.out.println(count + " day(s) above average.");
   }  


}