// This program prints the user's "gangsta" name. 

import java.util.*;
public class GangstaName {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.print("Type in your name, playa: ");
      String name = console.nextLine();
      
      // Get first/last name 
      String first = name.substring(0, name.indexOf(" "));
      String last = name.substring(name.indexOf(" ") + 1);
      String fLast = name.substring(0, 1);
      fLast = fLast.toUpperCase();
      System.out.println("Your gangsta name is \"" + fLast + 
         ". Diddy " + last.toUpperCase() + " " + first + "-izzle\"");
   }

}