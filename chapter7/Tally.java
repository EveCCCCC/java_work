// Reads a series of values and reports the frequency of 
// occurence of each value.

import java.io.*;    // for File
import java.util.*;  // for Scanner 

public class Tally {
   public static void main(String[] args) 
      throws FileNotFoundException {
         Scanner input = new Scanner(new File("tally.txt"));
         int[] count = new int[5];
         
         while (input.hasNextLine()) {
            String line = input.nextLine(); 
            Scanner lineScan = new Scanner(line); 
            
            while (lineScan.hasNextInt()) {
               int next = lineScan.nextInt();
               count[next]++; 
            }  
         }
         
         System.out.println("Value\tOccurences");
         for (int i = 0; i < count.length; i++) {
            System.out.println(i + "\t" + count[i]);
         }
            
   }
   
}