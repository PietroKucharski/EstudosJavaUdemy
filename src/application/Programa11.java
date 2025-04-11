package application;

import java.util.Locale;
import java.util.Scanner;

public class Programa11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n]; // Assim criamos um vetor em Java. [] indica a criação do vetor

        for (int i = 0; i < n; i++) { /* Estrutura de repetição que irá percorrer o vetor e adicionar os elementos nele */
            vect[i] = sc.nextDouble();
        }
        
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        double avg = sum / n;
        System.out.println("AVERAGE HEIGHT: " + avg);

        sc.close();
    }
}
