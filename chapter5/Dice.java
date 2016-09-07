import java.util.*;
public class Dice {
   public static void main(String[] args) {
      Random rand = new Random();
      int tries = 0;
      int sum = 0;
      
      while (sum != 7) {
         int rollOne = rand.nextInt(6) + 1;
         int rollTwo = rand.nextInt(6) + 1;
         sum = rollOne + rollTwo; 
         System.out.println(rollOne + " + " + rollTwo + 
            " = " + sum);
         tries++;
      }
      
      System.out.println("You won after " + tries + " tries!");  
   }
}