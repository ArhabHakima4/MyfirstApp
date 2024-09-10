package class_32_java_8_inheritance_polimorphism_abstraction_encapsulation;

// CurrentAccount class extending BankAccount
public class CurrentAccountMethod2 extends BankAccountMethod2 {
    private double overdraftLimit;

    // Constructor with accountHolderName, accountNumber, and overdraftLimit
    public CurrentAccountMethod2 (String accountHolderName, String accountNumber, double overdraftLimit) {
        super(accountHolderName, accountNumber);  // Calls the BankAccount constructor
        this.overdraftLimit = overdraftLimit;
    }

    // Overriding the abstract withdraw method to account for overdraft limit
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance + overdraftLimit >= amount) {
            updateBalance(balance - amount);
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Overdraft limit exceeded or invalid amount.");
        }
    }

    // Getter for overdraft limit
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}

