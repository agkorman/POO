package Guias.Guia3.Ej7;

public class SavingAccount extends BankAccount{

    public SavingAccount(int id) {
        super(id);
    }

    protected boolean canExtract(double amount) {
        return getBalance() >= amount;
    }
}
