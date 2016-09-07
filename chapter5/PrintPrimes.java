public class PrintPrimes {
   public static void main(String[] args) {
      printPrimes(20);
      printPrimes(30);
   }
   
   public static void printPrimes(int number) {
      if (number >= 2) {
         System.out.print("2");
         for (int i = 3; i <= number; i++) {
            if (countFactors(i) == 2) {
               System.out.print(", " + i);
            }
         }
      }
      System.out.println();
   }
   
   public static void countFactors(int number) {
      int count = 0;
      for (int i = 1; i <= number; i++) {
         if (number % i == 0) {
            count++;
         }
      }
   }

}