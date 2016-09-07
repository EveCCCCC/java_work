// This program prints numbers from 1 to the maximum
// separated by commas.

public class PrintNumbers {
   public static void main(String[] args) {
      printNumbers(5);
   }   
   
   public static void printNumbers(int number) {
      for (int count = 1; count <= number; count++) {
         if (count == number) {
            System.out.print(count);
            break;
         } 
         System.out.print(count + ", ");
      }
   }
}