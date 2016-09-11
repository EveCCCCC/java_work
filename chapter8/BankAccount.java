// Utilizes static fields so that each bank account gets a unique ID.

public class BankAccount {
   // Static count of how many accounts are created
   // (only one count is shared for the whole class)
   private static int objectCount = 0;
   
   // fields (replicated for each object)
   private String name;
   private int id;
   
   // Clients can call this to find out # accounts created.
   public static int getNumAccounts() {
      return objectCount;
   }
   
   public BankAccount() {
      objectCount++;       // advance the id, and
      id = objectCount;    // give number to the account
   }
   
   public int getID() { 
      return id;
   } 

}