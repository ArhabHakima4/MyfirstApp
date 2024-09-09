package class_32_java_8_inheritance_polimorphism_abstraction_encapsulation;

public class TestBankClass {
    public static void main(String[] args) {
BankAccount BankAccount = new SavingsAccount("azouaou dahmoune", 121000, 100000000);
        double a = BankAccount.getBalance();
        System.out.println("Balance: $"+ a);
        BankAccount.displayBalance();
        BankAccount.withdraw(120000);
        BankAccount.displayBalance();
    }
}
