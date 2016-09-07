public class BooleanReturnQuestions {
   public static void main(String[] args) {
      System.out.println(hasAnOddDigit(3526));
      System.out.println(allDigitsOdd(7531));
      System.out.println(isAllVowels("Ioau"));
   }
   
   public static boolean hasAnOddDigit(int number) {
      while (number > 0) {
         if (number % 2 != 0) {
            return true;
         }
         number = number / 10;  
      }
      return false;
   }
   
   public static boolean allDigitsOdd(int number) {
      while (number > 0) {
         if (number % 2 == 0) {
            return false;
         } 
         number = number / 10;
      }
      return true;
   }
   
   public static boolean isAllVowels(String s) {
      for (int i = 0; i < s.length(); i++) {
         String letter = s.substring(i, i + 1);
         if (!isVowel(letter)) {
            return false;
         } 
      }
      return true; 
   }
   
   public static boolean isVowel(String s) {
      return (s.equalsIgnoreCase("a") || s.equalsIgnoreCase("e") ||
         s.equalsIgnoreCase("i") || s.equalsIgnoreCase("o") || 
         s.equalsIgnoreCase("u"));   
   }
}