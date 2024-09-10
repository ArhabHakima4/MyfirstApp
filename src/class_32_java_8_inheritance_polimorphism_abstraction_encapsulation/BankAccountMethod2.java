package class_32_java_8_inheritance_polimorphism_abstraction_encapsulation;

// Abstract BankAccount class
public abstract class BankAccountMethod2 {
    protected double balance;  // Protected to allow access by subclasses
    private String accountHolderName;
    private String accountNumber;

    // Constructor with accountHolderName and accountNumber, balance starts at 0
    public BankAccountMethod2 (String accountHolderName, String accountNumber) {
        this.balance = 0;  // Default starting balance
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    // Method to deposit money, updating the balance using updateBalance()
    public void deposit(double amount, String note) {
        if (amount > 0) {
            updateBalance(balance + amount);
            System.out.println("Deposited: $" + amount + " (Note: " + note + ")");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Abstract method to withdraw money, to be implemented by subclasses
    public abstract void withdraw(double amount);

    // Protected method to update balance (encapsulation)
    protected void updateBalance(double newBalance) {
        this.balance = newBalance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Getters for accountHolderName and accountNumber
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}


