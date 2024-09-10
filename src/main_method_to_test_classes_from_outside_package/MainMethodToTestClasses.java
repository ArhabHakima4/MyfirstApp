package main_method_to_test_classes_from_outside_package;

import class_32_java_8_inheritance_polimorphism_abstraction_encapsulation.CurrentAccount;
import class_32_java_8_inheritance_polimorphism_abstraction_encapsulation.SavingsAccount;

public class MainMethodToTestClasses {
    public static void main(String[] args) {
        SavingsAccount SavingsAccount = new SavingsAccount("azouaou", 121000, 12000000);
        SavingsAccount.displayBalance();
        SavingsAccount.withdraw(2000000);
        SavingsAccount.displayBalance();
        SavingsAccount.deposit(4000000);
        SavingsAccount.displayBalance();
        System.out.println("----------------------------------------------------------------------------");
        CurrentAccount CurrentAccount = new CurrentAccount("azouaou", 121000, 12000000);
        CurrentAccount.withdraw(250000);
        CurrentAccount.displayBalance();
        CurrentAccount.deposit(4500000, "from robinhood");
        CurrentAccount.displayBalance();
        System.out.println("------------------------------------------------------------------------------");
        Double total = CurrentAccount.getBalance()+ SavingsAccount.getBalance();
        System.out.println("Total Account balance: "+total);

    }
}





