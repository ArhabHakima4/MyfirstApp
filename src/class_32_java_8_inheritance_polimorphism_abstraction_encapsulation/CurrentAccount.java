package class_32_java_8_inheritance_polimorphism_abstraction_encapsulation;
//subclass: CurentAccount (inheritance & method Overriding
public class CurrentAccount extends BankAccount{
    private final double overdraftLimit = 1000.0;
    //constructor
    public CurrentAccount (String accountHolderName, int accountNumber, double balance) {
        super (accountHolderName, accountNumber, balance);
    }


    //override withdraw method to allow overdraft
    @Override
    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            updateBalance(getBalance()-amount);
            System.out.println("withdrawn: $"+amount+" from Current Account");
        }else {
            System.out.println("withdrawal denied. Overdraft limit exceeded");
        }
    }
}
