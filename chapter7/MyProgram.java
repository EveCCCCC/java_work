// Returns an array with two copies of each value.
import java.util.*;

public class MyProgram {
   public static void main(String[] args) { 
      int[] numbers = {1, 4, 0, 7};      
      int[] result = stutter(numbers);
      System.out.println(Arrays.toString(result));
   }
   
   public static int[] stutter(int[] numbers) {
      int[] result = new int[2 * numbers.length];
      for (int i = 0; i < numbers.length; i++) {
         result[2 * i] = numbers[i];
         result[2 * i + 1] = numbers[i]; 
      }
      return result;
   }
}