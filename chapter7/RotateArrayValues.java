// Rotates values of an array to the left or to the right.

import java.util.*;  // for Arrays

public class RotateArrayValues {
   public static void main(String[] args) {
      int[] arr1 = {56, 72, 43, 27, 83};
      int[] arr2 = {45, 23, 53, 28, 89};
      System.out.println(Arrays.toString(rotateLeft(arr1)));
      System.out.println(Arrays.toString(rotateRight(arr2)));
   }
   
   // Places the first element of the array at the last
   // while shifting the other elements forward.   
   public static int[] rotateLeft(int[] list) {
      int first = list[0];
      for (int i = 0; i < list.length - 1; i++) {
         list[i] = list[i + 1];
      }
      list[list.length - 1] = first;
      return list;
   }
   
   // Places the last element of the array at the first
   // while shifting the other elements backward.
   public static int[] rotateRight(int[] list) {
      int last = list[list.length - 1];
      for (int i = list.length - 1; i > 0; i--) {
         list[i] = list[i - 1];
      }
      list[0] = last;
      return list;
   }

}