public class Stars4 {
   public static void main(String[] args) {
      line(13);
      line(7);
      line(35);
      System.out.println();
      drawBox(4, 5);
      drawBox(3, 5);
      drawBox(4, 3);
      
   }  
   
   public static void line(int count) {
      repeat("*", count);
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
   
   public static void repeat(String s, int times) {
      for (int i = 1; i <= times; i++) {
         System.out.print(s);
      }
      System.out.println();
   }
}