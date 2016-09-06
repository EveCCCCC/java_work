// This program finds the lowest common multiple of two numbers
// by finding the greatest common factor.

public class FindLCM {
   public static void main(String[] args) {
      System.out.println(LCM(4, 5));       // should return 20 
      System.out.println(LCM(5, 8));       // should return 40 
   }

   // Applying the Euclidean algorithm to find the GCF - Greatest Common Factor 
   public static int GCF(int num1, int num2) {
      while (num1 != num2) {
         if (num1 > num2) {
            num1 -= num2;
         } else {
            num2 -= num1;
         }
      }
      return num1;
   } 
   
   public static int LCM(int num1, int num2) {
      return ((num1 * num2) / GCF(num1, num2));
   }
   
}