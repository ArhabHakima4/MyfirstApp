package class_32_java_8_inheritance_polimorphism_abstraction_encapsulation;

public class TestBankClassMethod2 {
    public static void main(String[] args) {
        // Current Account with overdraft limit
        CurrentAccountMethod2 currentAccountMethod2 = new CurrentAccountMethod2("John Doe", "CA123456", 1000);
        currentAccountMethod2.deposit(500, "Initial deposit");
        currentAccountMethod2.withdraw(1200);  // Overdraft limit allows this
        System.out.println("Current Account Balance: " + currentAccountMethod2.getBalance());
        System.out.println("Account Holder: " + currentAccountMethod2.getAccountHolderName());
        System.out.println("Account Number: " + currentAccountMethod2.getAccountNumber());

        // Savings Account with minimum balance requirement
        SavingsAccountMethod2 savingsAccountMethod2 = new SavingsAccountMethod2 ("Jane Smith", "SA654321");
        savingsAccountMethod2.deposit(1000, "Savings deposit");
        savingsAccountMethod2.withdraw(600);  // Withdrawal allowed
        savingsAccountMethod2.withdraw(400);  // Denied because it would drop below minimum balance
        System.out.println("Savings Account Balance: " + savingsAccountMethod2.getBalance());
        System.out.println("Account Holder: " + savingsAccountMethod2.getAccountHolderName());
        System.out.println("Account Number: " + savingsAccountMethod2.getAccountNumber());
        savingsAccountMethod2.updateBalance(10000);
    }
}

