package Guias.Guia3.Ej7;

public class CheckingAccount extends BankAccount{

    private double overdraft;

    public CheckingAccount(int id, double overdraft) {
        super(id); // new BankAccount(id)
        this.overdraft = overdraft;
    }

    @Override
    protected boolean canExtract(double amount) {
        return getBalance() + overdraft >= amount;
    }
}
