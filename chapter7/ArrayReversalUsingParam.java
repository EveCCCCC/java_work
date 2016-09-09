import java.util.*;

public class ArrayReversalUsingParam {
   public static void main(String[] args) {
      int[] numbers = {11, 42, -5, 27, 0, 89};
      
      System.out.println("Original array: " + Arrays.toString(numbers));
      
      int[] result = reverse(numbers); 
      
      System.out.println("Array reversed: " + Arrays.toString(result));
   }
   
   public static int[] reverse(int[] numbers) {
      for (int i = 0; i < (numbers.length / 2); i++) {
         int temp = numbers[i];
         numbers[i] = numbers[numbers.length - 1 - i];
         numbers[numbers.length - 1 - i] = temp;
      }
      
      return numbers;
   }

}