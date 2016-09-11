public class BankAccountMain {
   public static void main(String[] args) {
      BankAccount bankAcc1 = new BankAccount();
   
      System.out.println("BankAcc1 ID: " + bankAcc1.getID());
      System.out.println("Number of accounts created: " + 
         BankAccount.getNumAccounts());
   }
}