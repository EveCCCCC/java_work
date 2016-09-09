/* Self-Check Problems
 * Section 7.2: Array Traversal Algorithms
 * Question 16
 */
 
import java.util.*;     // for Arrays

public class SCPQuestionSixteen {
   public static void main(String[] args) {
      int[] array = {10, 20, 30, 40, 50};
      System.out.println(Arrays.toString(swapPairs(array)));    // should output [20, 10, 40, 30, 50]
   }
   
   public static int[] swapPairs(int[] list) {
      int j = 0;
      for(int i = 0; i < list.length / 2; i++) {
         swap(list, j, j + 1);
         j += 2;
      }
      return list;
   }
   
   public static void swap(int[] list, int i, int j) {
      int temp = list[i];
      list[i] = list[j];
      list[j] = temp;
   }
}
