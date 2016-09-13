public class EmployeeMain2 {
   public static void main(String[] args) {
      Employee[] e = {  new Lawyer(0), new Secretary(0),
                        new Marketer(0), new LegalSecretary(0) }; 
      for (int i = 0; i < e.length; i++) {
         System.out.println("Salary: " + e[i].getSalary());
         System.out.println("V.days: " + e[i].getVacationDays());
         System.out.println();
      }
   }
      
}