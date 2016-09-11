// This class is a module that contains useful methods 
// related to factors and prime numbers.

public class Factors {
   // Returns the number of factors of the given integer.
   public static int countFactors(int number) {
      int count = 0;
      for (int i = 1; i <= number; i++) {
         if (number % i == 0) {
            count++;
         }
      }
      return count; 
   }
   
   public static boolean isPrime(int number) {
      return (countFactors(number) == 2);
   }
     
}