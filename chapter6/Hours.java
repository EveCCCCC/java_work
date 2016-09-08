// Processes an employee input file and outputs each employee's hours. 

import java.io.*;    // for File
import java.util.*;  // for Scanner 

public class Hours {
   public static void main(String[] args) 
         throws FileNotFoundException {
      Scanner input = new Scanner(new File("hours.txt"));
      PrintStream output = new PrintStream(new File("hours_out.txt"));
      
      while (input.hasNextLine()) {
         String line = input.nextLine();
         Scanner lineScan = new Scanner(line);
         int id = lineScan.nextInt();
         String name = lineScan.next();
         double sum = 0.0;
         int count = 0;
         
         while(lineScan.hasNextDouble()) {
            sum = sum + lineScan.nextDouble();
            count++;
      }
         double average = sum / count;
         output.println(name + " (ID: #" + id + ") worked " +
            sum + " hours (" + average + " hours/day)");   
      }   
   }
}