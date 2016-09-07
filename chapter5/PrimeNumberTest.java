public class PrimeNumberTest {
   public static boolean isPrime(int number) {
      int factors = 0;
      for (int i = 1; i <= number; i++) {
         if (number % i == 0) {
            factors++;
         }
      }
      if (factors == 2) {
         return true;
      } else {
         return false;
      }
   }
   
   public static void main(String[] args) {
      System.out.println(isPrime(3)); 
   }
}