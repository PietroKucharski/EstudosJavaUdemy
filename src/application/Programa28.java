package application;

import entities.Account02;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Programa28 {
    public static void main(String[] args) {
        Account02 account = new Account02(1001, "Pietro", 0.0);
        BusinessAccount businessAccount = new BusinessAccount(1002, "Vittor", 0.0, 500.0);

        /* Uppcasting */
        Account02 account01 = account;
        Account02 account02 = new BusinessAccount(1003, "Rafael", 0.0, 200);
        Account02 account03 = new SavingsAccount(1004, "Fran", 0.0, 0.01);

        /* Downcasting */
        BusinessAccount businessAccount1 = (BusinessAccount) account02;
        businessAccount1.loan(100.0);

        // BusinessAccount businessAccount2 = (BusinessAccount) account03; -> Operação de erro pois não é possível fazer este casting

        if(account03 instanceof BusinessAccount) { // Esse if não vai ser executado
            BusinessAccount businessAccount2 = (BusinessAccount) account03;
            businessAccount2.loan(200.0);
            System.out.println("Loan");
        } else if (account03 instanceof SavingsAccount) {
            SavingsAccount savingsAccount = (SavingsAccount) account03;
            savingsAccount.updateBalance();
            System.out.println("Update");
        }
    }
}
