package class_32_java_8_inheritance_polimorphism_abstraction_encapsulation;

// SavingsAccount class extending BankAccount
class SavingsAccountMethod2 extends BankAccountMethod2 {
    private final double minimumBalance = 500.0;

    // Constructor with accountHolderName and accountNumber
    public SavingsAccountMethod2 (String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);  // Calls the BankAccount constructor
    }

    // Overriding the abstract withdraw method to respect the minimum balance requirement
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= minimumBalance) {
            updateBalance(balance - amount);
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Withdrawal denied: Minimum balance requirement of $" + minimumBalance + " must be maintained.");
        }
    }

    // Getter for minimum balance
    public double getMinimumBalance() {
        return minimumBalance;
    }
}

