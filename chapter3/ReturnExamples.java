public class ReturnExamples {
   public static void main(String[] args) {
      System.out.println(slope(1, 3, 5, 11));
      System.out.println(Math.round(fToC(80.0)));
      System.out.println(hypotenuse(3, 4));  
   }

   public static double slope(int x1, int y1, int x2, int y2) {
      int dy = y2 - y1;
      int dx = x2 - x1;
      return (double) (dy/dx);
   }
   
   public static double fToC(double degreesF) {
      double degreesC = 5.0 / 9.0 * (degreesF - 32);
      return degreesC;
   }
   
   public static double hypotenuse(int a, int b) {
      double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
      return c;
   }

}