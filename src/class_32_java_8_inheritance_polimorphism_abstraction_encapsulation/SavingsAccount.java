package class_32_java_8_inheritance_polimorphism_abstraction_encapsulation;
//subclass: SavingsAccount(inheritance & Method overriding
public class SavingsAccount extends BankAccount {
   private final double minimumBalance = 500.0;
  //constructor
   public SavingsAccount (String accountHolderName, int accountNumber, double balance) {
       super (accountHolderName, accountNumber, balance);
   }
   //Override withdraw method to ensure minimum balance
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= minimumBalance) {
            updateBalance(getBalance() - amount);
            System.out.println("Withdrawn: "+amount);
        } else {
            System.out.println("Withdrawal denied. Minimum balance of $"+minimumBalance+" required");
        }
    }
}
