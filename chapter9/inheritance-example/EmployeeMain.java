public class EmployeeMain {
   public static void main(String[] args) {
      Lawyer lisa = new Lawyer(0);
      Secretary steve = new Secretary(0);
      printInfo(lisa);
      printInfo(steve);
   }
   
   public static void printInfo(Employee emp1) {
      System.out.println("salary: " + emp1.getSalary());
      System.out.println("v.days: " + emp1.getVacationDays());
      System.out.println("v.form: " + emp1.getVacationForm());
      
   
   }

}