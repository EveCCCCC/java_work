public class StringMethodExamples {
   public static void main(String[] args) {
   
   // index        0123456789(10)
      String s1 = "Marty Stepp";
      String s2 = "Stuart Reges";
      System.out.println(s1.length());
      System.out.println(s1.indexOf("e"));
      System.out.println(s2.substring(7, 10));
      String s3 = s1.substring(0, 6);
      System.out.println(s3);
      System.out.println(s3.toLowerCase()); 
   }

}