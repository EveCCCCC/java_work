public class Stars {
   public static void main(String[] args) {
      line(4);
      line(15);
      line(12);
      drawBox(5, 4);
      drawBox(4, 3);
      drawBox(3, 2);
   }
   
   public static void line(int count) {
      for (int i = 1; i <= count; i++) {
         System.out.print("*");
      }
      System.out.println();
   }
   
   public static void drawBox(int width, int height) {
      line(width);
      for (int line = 1; line <= height - 2; line++) {
         System.out.print("*");
         for (int space = 1; space <= width - 2; space++) {
            System.out.print(" ");
         }
         System.out.println("*");
      }
      line(width);
   }

}