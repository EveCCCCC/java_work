// This program sees whether some interesting numbers are prime.

public class Prime {
   public static void main(String[] args) {
      int[] nums = {1234517, 859501, 53, 142};
      for (int i = 0; i < nums.length; i++) {
         if (Factors.isPrime(nums[i])) {
            System.out.println(nums[i] + " is prime.");
         }
      }
   }
   
}