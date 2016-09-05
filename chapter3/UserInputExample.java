import java.util.*;     // To access the Scanner class 
public class UserInputExample {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      
      System.out.print("How old are you? ");
      System.out.println();
      int age = console.nextInt();
      
      int years = 65 - age;
      System.out.println(years + " years to retirement!");
   }

}