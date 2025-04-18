package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Aula09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        char resp;

        do {
            System.out.print("Digite a temperatura em celsius: ");
            double c = sc.nextDouble();
            double f = 9.0 * c / 5.0 + 32.0;

            System.out.printf("Equivalente a Fahrenheit %.1f%n", f);
            System.out.print("Deseja repitir (s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');
    }
}
