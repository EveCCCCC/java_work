/* Self-Check Problems
 * Section 7.2: Array Traversal Algorithms
 * Question 14
 */
 
public class SCPQuestionFourteen {
   public static void main(String[] args) {
      int[] arr1 = {14, 15, 16, 17};
      int[] arr2 = {56, 57, 58, 59};
      System.out.println(allLess(arr1, arr2));
   }
   
   public static boolean allLess(int[] list1, int[] list2) {
      
      if (list1.length != list2.length) {
         return false;
      }
      
      for (int i = 0; i < list1.length; i++) {
         if (list1[i] > list2[i]) {
            return false;
         }
      }
      return true; 
   }

}
