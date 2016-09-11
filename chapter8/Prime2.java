// This program prints all the prime numbers up to a given maximum.

import java.util.*;

public class Prime2 {
   
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.print("Max number? ");
      int max = console.nextInt();
   
      for (int i = 2; i <= max; i++) {
         if (Factors.isPrime(i)) { 
            System.out.print(i + " ");
         }
      }
      
   }
}