package Guias.Guia3.Ej7_BankAccount;

public abstract class BankAccount {

    private int id;
    private double balance;

    public BankAccount(int id) {
        this.id = id;
        this.balance = 0;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void extract(double amount) {
        if (!canExtract(amount)) {
            throw new RuntimeException("Fondos insuficientes");
        }
        this.balance -= amount;
    }

    protected abstract boolean canExtract(double amount);

    public double getBalance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return "Cuenta %d con saldo %.2f".formatted(id, balance);
    }

}
