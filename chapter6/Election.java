// Computes leader in presidential polls

import java.io.*;    // for File
import java.util.*;  // for Scanner

public class Election {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("poll.txt"));
      int obamaVotes = 0, mccainVotes = 0;
      
      while (input.hasNext()) {
         if (input.hasNextInt()) {
            int obama = input.nextInt();
            int mccain = input.nextInt();
            int eVotes = input.nextInt();
            if (obama > mccain) {
               obamaVotes += eVotes;
            } else {
               mccainVotes += eVotes;
            }
         } else {
            input.next();     // skips any noninteger input
         }
      
      }
      System.out.println("Obama: " + obamaVotes + " votes");
      System.out.println("McCain: " + mccainVotes + " votes");
   }

}