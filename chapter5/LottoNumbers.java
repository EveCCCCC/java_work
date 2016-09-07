import java.util.*;
public class LottoNumbers {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      Random rand = new Random();
      
      System.out.print("How many rounds? ");
      int rounds = console.nextInt();
      for (int j = 1; j <= rounds; j++) {
         seven(rand);
         System.out.println();
      } 
   }
   
   public static boolean seven(Random rand) {
      for (int i = 1; i <= 10; i++) {
         int n = rand.nextInt(30) + 1;
         System.out.print(n + " ");
         
         if (n == 7) {
            return true;
         } 
      }       
      return false;    
   }
   
}