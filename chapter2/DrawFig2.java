public class DrawFig2 {
   public static void main(String[] args) {
      drawLine();
      drawCone();
      drawCone();
      drawLine();
      drawV();
      drawV();
      drawLine();
   }
   
   public static void drawLine() {
      System.out.print("+");
      for (int i = 1; i <= 6; i++) {
         System.out.print("-");
      }
      System.out.println("+");
   }
      
   public static void drawCone() {
      for (int line = 1; line <= 3; line++) {
         System.out.print("|");
         for (int i = 1; i <= (3 - line); i++) {
            System.out.print(" ");
         }
         System.out.print("^");
         for (int i = 1; i <= (line * 2 - 2); i++) {
            System.out.print(" ");
         }
         System.out.print("^");
         for (int i = 1; i <= (3 - line); i++) {
            System.out.print(" ");
         }
         System.out.println("|"); 
      }
   }
   
   public static void drawV() {
      for (int line = 1; line <= 3; line++) {
         System.out.print("|");
         for (int i = 1; i <= (line - 1); i++) {
            System.out.print(" ");
         }
         System.out.print("v");
         for (int i = 1; i <= (6 - 2 * line); i++) {
            System.out.print(" ");
         }
         System.out.print("v");
         for (int i = 1; i <= (line - 1); i++) {
            System.out.print(" ");
         }
         System.out.println("|");
      }
   }
   
}