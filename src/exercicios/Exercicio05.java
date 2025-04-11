package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
//        int x = 4;
//        int y = x + 2;
//
//        for (int i = 0; i < x; i++) {
//            System.out.println(x + " " + y);
//
//            y += i;
//        }
//        for (int i = 1; i < 5; i++) {
//            int y = i - 1;
//            int x = i * 10;
//            System.out.println(i);
//        }
//        int y = 10;
//
//        for (int i = 0; i < 4; i++) {
//            System.out.print(i);
//            y += i;
//            System.out.println(y);
//        }

        // Exercicio 01

//        int x = sc.nextInt();
//
//        for (int i = 1; i <= x; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//
//            }
//        }

        // Exercicio 02

//        int n = sc.nextInt();
//        int in = 0;
//        int out = 0;
//
//        for (int i = 0; i < n; i++) {
//            int x = sc.nextInt();
//
//
//            if (x >= 10 && x <= 20) {
//                // outra alternariva in += 1;
//                in++;
//            } else {
//                // outra alternariva out  += 1;
//                out++;
//            }
//        }
//
//        System.out.println(in + " in");
//        System.out.println(out + " out");

        // Exercicio 03

//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            double a = sc.nextDouble();
//            double b = sc.nextDouble();
//            double c = sc.nextDouble();
//
//
//            double mediaPonderada = (a * 2 + b * 3 + c * 5) / 10;
//
//            System.out.printf("%.1f%n", mediaPonderada);
//
//        }

        // Exercicio 04

//        int n = sc.nextInt();
//
//
//        for (int i = 0; i < n; i++) {
//            int numerador = sc.nextInt();
//            int denominador = sc.nextInt();
//
//            if (denominador == 0) {
//                System.out.println("Divisão impossíveç");
//            } else {
//                double divisao = (double) numerador / denominador;
//                System.out.printf("%.1f%n", divisao);
//            }
//        }

        // Exercicio 05
//        int n = sc.nextInt();
//        int fatorial = 1;
//
//        for (int i = 1; i <= n; i++) {
//            fatorial = fatorial * i;
//
//        }
//        System.out.println(fatorial);

        // Exercicio 06

//        int n = sc.nextInt();
//        int contador = 0;
//
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                contador = i;
//                System.out.println(contador);
//            }
//        }

        // Exercicio 07

//        int n = sc.nextInt();
//
//
//        for (int i = 1; i <= n; i++) {
//            double quadrado = Math.pow(i, 2);
//            double cubo = Math.pow(i, 3);
//
//            // ou
//
//            int quadrado = i * i;
//            int cubo = i * i * i;
//            System.out.printf("%d %d %d%n", i, quadrado, cubo);
//
//        }
        sc.close();

    }
}