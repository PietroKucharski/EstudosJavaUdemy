package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Exercicio 01

//        int num;
//
//        System.out.println("Digite um número");
//        num = sc.nextInt();
//
//        if (num < 0) {
//            System.out.println("Negativo");
//        } else {
//            System.out.println("Positivo");
//        }


        // Exercicio 02
//        int num;
//
//        System.out.println("Digite um número");
//        num = sc.nextInt();
//
//        if (num % 2 == 0) {
//            System.out.println("Par");
//        } else {
//            System.out.println("Impar");
//        }

        // Exercicio 03
//        int A, B;
//
//        System.out.println("Digite os números");
//        A = sc.nextInt();
//        B = sc.nextInt();
//
//        if(A % B == 0 || B % A == 0) {
//            System.out.println("Multiplos");
//        } else {
//            System.out.println("Não multiplos");
//        }

        // Exercicio 04

//        int horaInicial = sc.nextInt();
//        int horaFinal = sc.nextInt();
//
//        int duracao;
//        if (horaInicial < horaFinal) {
//            duracao = horaFinal - horaInicial;
//        }
//        else {
//            duracao = 24 - horaInicial + horaFinal;
//        }
//
//        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        // Exercicio 05
//        int codigo = sc.nextInt();
//        int quantidade = sc.nextInt();
//        double total;
//
//        if (codigo == 1) {
//            total = quantidade * 4.00;
//        } else if (codigo == 2) {
//            total = quantidade * 4.50;
//        } else if (codigo == 3) {
//            total = quantidade * 5;
//        } else if (codigo == 4) {
//            total = quantidade * 2.00;
//        } else {
//            total = quantidade * 1.50;
//        }
//
//        System.out.println("O total é: " + total);

        // Exercicio 06
//        double valor = sc.nextDouble();
//
//        if (valor < 0.0 || valor > 100.0) {
//            System.out.println("Fora de intervalo");
//        }
//        else if (valor <= 25.0) {
//            System.out.println("Intervalo [0,25]");
//        }
//        else if (valor <= 50.0) {
//            System.out.println("Intervalo (25,50]");
//        }
//        else if (valor <= 75.0) {
//            System.out.println("Intervalo (50,75]");
//        }
//        else {
//            System.out.println("Intervalo (75,100]");
//        }

        // Exercicio 07
//        double x = sc.nextDouble();
//        double y = sc.nextDouble();
//
//        if (x == 0.0 && y == 0.0) {
//            System.out.println("Origem");
//        }
//        else if (x == 0.0) {
//            System.out.println("Eixo Y");
//        }
//        else if (y == 0.0) {
//            System.out.println("Eixo X");
//        }
//        else if (x > 0.0 && y > 0.0) {
//            System.out.println("Q1");
//        }
//        else if (x < 0.0 && y > 0.0) {
//            System.out.println("Q2");
//        }
//        else if (x < 0.0 && y < 0.0) {
//            System.out.println("Q3");
//        }
//        else {
//            System.out.println("Q4");
//        }

        // Exercicio 08

        double salario = sc.nextDouble();
        double imposto;

        if (salario <= 2000.00) {
            imposto = 0.0;
        } else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
        } else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        } else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$%.2f%n", imposto);
        }
        sc.close();
    }
}
