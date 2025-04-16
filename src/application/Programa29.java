package application;

import entities.Account02;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Programa29 {
    public static void main(String[] args) {
        Account02 account = new Account02(1001, "Pietro", 1000.0);
        account.withdraw(200.0);
        System.out.println(account.getBalance());

        Account02 account1 = new SavingsAccount(1002, "Vittor", 1000.0, 0.01);
        account1.withdraw(200);
        System.out.println(account1.getBalance());

        Account02 account2 = new BusinessAccount(1003, "Rafael", 1000.0, 500.0);
        account2.withdraw(200);
        System.out.println(account2.getBalance());
    }
}
