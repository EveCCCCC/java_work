/* Self-Check Problems
 * Section 7.2: Array Traversal Algorithms
 * Question 12
 */
 
import java.util.*;     // for Arrays 

public class SCPQuestionTwelve {
   
   public static void main(String[] args) {
      int[] array = {14, 29, 78, 89, 87};
      System.out.println(Arrays.toString(printBackwards(array)));
   }
   
   public static void swap(int[] array, int i, int j) {
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
   }
   
   public static int[] printBackwards(int[] array) {
      for (int i = 0; i < array.length / 2; i++) {
         swap(array, i, array.length - i - 1);
      }
      return array;
   }
}