public class SumDigits {
   public static void main(String[] args) {
      System.out.println(digitSum(1890));
   }
   
   public static int digitSum(int number) {
      
      int sum = 0;
       
      while (number > 0) {
         sum = sum + number % 10;   // add the last digit 
         number = number / 10;      // remove the last digit  
      }
      return sum;
   }   
}