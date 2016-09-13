// A class to represent secretaries.

public class Secretary extends Employee {

   public Secretary(int years) {
      super(years);
   }
   
   // Secretaries don't get a bonus for their years of service.
   public int getSeniorityBonus() {
      return 0;
   }
   
   public void takeDictation(String text) {
      System.out.println("Taking dictation of text: " +
         text);
   }
}