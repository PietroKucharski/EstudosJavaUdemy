package application;

import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Programa50 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();

        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService service = new UsaInterestService(1.0);
        double payment = service.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.printf("%.2f", payment);
    }
}
