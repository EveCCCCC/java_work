// A class to represent employees in general (20-page manual)

public class Employee {

   // Declare private variable only accessible in the class
   private int years;
   
   public Employee(int initialYears) {
      years = initialYears;   
   }
   
   public int getYears() {
      return years;
   }
   
   public int getHours() {
      return 40;           // works 40 hours / week
   }
   
   public double getSalary() {
      return 50000.0;        // $50,000 / year
   }
      
   public int getVacationDays() {
      return 10 + getSeniorityBonus(); 
   }
   
   public int getSeniorityBonus() {
      return 2 * years;
   }
   
   public String getVacationForm() {
      return "yellow";     // use the yellow form
   }

}