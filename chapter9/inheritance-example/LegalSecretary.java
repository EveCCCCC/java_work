// A class to represent legal secretaries.
// Since Secretary does not have constructors,
// LegalSecretary compiles without a constructor.

public class LegalSecretary extends Secretary {
   
   public LegalSecretary(int years) {
      super(years);
   }
   
   public double getSalary() {
      return (super.getSalary() + 5000.0);     
   }
   
   public void fileLegalBriefs() {
      System.out.println("I could file all day!");    
   }
}