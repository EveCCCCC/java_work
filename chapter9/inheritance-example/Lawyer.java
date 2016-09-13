// A class to represent lawyers.
public class Lawyer extends Employee {

   public Lawyer(int years) {
      super(years);    // calls Employee() constructor
   }
   
   public double getSalary() {
      return (super.getSalary() + 5000 * getYears());
   }
   
   // overrides getVacationForm from Employee class
   public String getVacationForm() {
      return "pink";
   }
   
   // overrides getVacationDays from Employee class
   public int getVacationDays() {
      return super.getVacationDays() + 5; 
   }
   
   public void sue() {
      System.out.println("I'll see you in court!");
   }
}