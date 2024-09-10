package class_32_java_8_inheritance_polimorphism_abstraction_encapsulation;
//abstract class: BankAccount
public abstract class BankAccount {
    //Encapsulated fiels
    private String accountHolderName;
    private int accountNumber;
    private double balance;
    //constructor
    public BankAccount (String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //Encapsulation (Getters)
    public String getAccountHolderName () {
        return accountHolderName;
    }
    public int getAccountNumber () {
        return accountNumber;
    }
    public double getBalance () {
        return balance;
    }
    //Encapsulation (Setters)
    public void setAccountHolderName (String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    //method to deposit money (overloaded)
    public void deposit (double amount) {
        balance = balance + amount;
        System.out.println("Deposited: $"+amount);
    }
    public void deposit (double amount, String note) {
        balance = balance + amount;
        System.out.println("Deposited: $"+amount+"(Note: "+note+")");
    }
    //abstract method for withdrawing
    public abstract void withdraw (double amount);
    //method to display balance
    public void displayBalance () {
        System.out.println("Balance: $"+balance);
    }
    //protected method to update balance (Encapsulation)
    protected void updateBalance (double newBalance) {
        this.balance = newBalance;
    }
}
