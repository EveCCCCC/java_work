import java.util.*;  
public class ScannerMultiply {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.println("Please type two numbers: ");
      int num1 = console.nextInt();
      int num2 = console.nextInt();
      
      int product = num1 * num2;
      System.out.println(num1 + " times " + num2 + " equals to " + product);
   }
}