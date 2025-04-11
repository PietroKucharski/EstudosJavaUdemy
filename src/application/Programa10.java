package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Programa10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        String holder = sc.next();

        System.out.print("Is there an initial deposit (y/n)? ");
        char isInitialDeposit = sc.next().charAt(0);

        if (isInitialDeposit != 'n') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }

        account = new Account(number, holder);

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);

        System.out.println("Uppdated account data:");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withDrawValue = sc.nextDouble();
        account.withDraw(withDrawValue);

        System.out.println("Uppdated account data:");
        System.out.println(account);
    }
}
