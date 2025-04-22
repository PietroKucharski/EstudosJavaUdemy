package application;

import entities.Account03;
import exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Programa39 {
    public static void main(String[] args) {
        /* Exercicio de fixação
        Fazer um programa para ler os dados de uma conta bancária e depois realizar um saque nesta conta bancária,
        mostrando o novo saldo. Um saque não pode ocorrer ou se não houver saldo na conta, ou se o valor do saque for
        superior ao limite de saque da conta
        Class Account -> number:Integer; holder:String; balance:Double; withdrawLimit:Double;
                         depoist(Double amount): void; withdraw(amount:Double): void
        */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");

        System.out.print("Number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Holder: ");
        String accountHolder = sc.next();

        System.out.print("Initial Balance: ");
        double initialAccountBalance = sc.nextDouble();

        System.out.print("Withdraw limit: ");
        double withdrawLimitAccount = sc.nextDouble();

        Account03 account = new Account03(accountNumber, accountHolder, initialAccountBalance, withdrawLimitAccount);

        System.out.print("Enter amount for withdraw: ");
        double amountWithdraw = sc.nextDouble();
        try {
            account.withDraw(amountWithdraw);
            System.out.printf("New balance: %.2f%n", account.getBalance());
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        }
    }
}
