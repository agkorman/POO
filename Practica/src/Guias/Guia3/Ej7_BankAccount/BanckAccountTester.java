package Guias.Guia3.Ej7_BankAccount;

public class BanckAccountTester {
    public static void main(String[] args) {
        CheckingAccount myCheckingAccount = new CheckingAccount(1001, 50);
        myCheckingAccount.deposit(100.0);
        System.out.println(myCheckingAccount);
        myCheckingAccount.extract(150.0);
        System.out.println(myCheckingAccount);
        SavingAccount mySavingsAccount = new SavingAccount(1002);
        mySavingsAccount.deposit(100.0);
        System.out.println(mySavingsAccount);
        mySavingsAccount.extract(150.0); // No se realiza por falta de fondos
        System.out.println(mySavingsAccount);
    }

}
