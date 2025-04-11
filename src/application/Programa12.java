package application;

import entities.Product04;

import java.util.Locale;
import java.util.Scanner;

public class Programa12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product04[] vect = new Product04[n];

        for (int i = 0; i < vect.length; i++) { /* Podemos usar tanto a variável n quanto vect.lenght */
            String name = sc.next();
            double price = sc.nextDouble();

            /* Irá fazer a instanciação dos produtos e guardar dentro do vetor */
            vect[i] = new Product04(name, price);
        }

        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / n;

        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        sc.close();
    }
}
