package Guias.Guia6.Ej4_BankAccount;

import Guias.Guia3.Ej7_BankAccount.*;

import java.util.HashSet;
import java.util.Set;

public class Bank {

    Set<BankAccount> accounts;

    public Bank() {
        accounts = new HashSet<BankAccount>();
    }

    public void addAccount(BankAccount ac) {
        accounts.add(ac);
    }

    public int accountSize(){
        return accounts.size();
    }

    public int totalAmount() {
        int ans = 0;
        for (BankAccount ac : accounts) {
            ans += ac.getBalance();
        }
        return ans;
    }

    public void removeAccount(BankAccount ac) {
        accounts.remove(ac);
    }

}
