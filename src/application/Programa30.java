package application;

import entities.Account02;
import entities.SavingsAccount;

public class Programa30 {
    public static void main(String[] args) {
        Account02 x = new Account02(1020, "Pietro", 1000.0);
        Account02 y = new SavingsAccount(1023, "Vittor", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
