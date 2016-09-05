public class MultipleParamsExample {
   public static void main(String[] args) {
      printNumber(4, 5);
      printNumber(5, 5);
      printNumber(9, 1);
   }
   
   public static void printNumber(int number, int count) {
      for (int i = 1; i <= count; i++) {
         System.out.print(number);
      }
      System.out.println();
   }
}
