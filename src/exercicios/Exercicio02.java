package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Exercicio 01
//        int valor1 = sc.nextInt();
//        int valor2 = sc.nextInt();
//        int soma = valor1 + valor2;
//
//        System.out.println("A soma dos valores é: " + soma);

        // Exercicio 02
//        double raio = sc.nextDouble();
//        double pi = 3.14159;
//        double formulaDaArea = pi * raio * raio;
//
//        System.out.printf("O valor é: %.4f%n", formulaDaArea);

        // Exercicio 03
//        int A, B, C, D;
//
//        A = sc.nextInt();
//        B = sc.nextInt();
//        C = sc.nextInt();
//        D = sc.nextInt();
//
//        int diferenca = (A * B - C * D);
//
//        System.out.println("A diferença é: " + diferenca);

        // Exercicio 04
//        int numeroFuncionario = sc.nextInt();
//        int horasTrabalhadas = sc.nextInt();
//        double valorHoraTrabalhada = sc.nextDouble();
//        double salario = horasTrabalhadas * valorHoraTrabalhada;
//
//        System.out.printf("Number = %d Salary = U$%.2f", numeroFuncionario, salario);
//        System.out.println("NUMBER = " + numeroFuncionario);
//        System.out.printf("SALARY = U$ %.2f%n", salario);

        // Exercicio 05
//        int numeroPeca1, numeroPeca2, qtdPeca1, qtdPeca2;
//        double valorPeca1, valorPeca2, precoFinal;
//
//        numeroPeca1 = sc.nextInt();
//        qtdPeca1 = sc.nextInt();
//        valorPeca1 = sc.nextDouble();
//
//        numeroPeca2 = sc.nextInt();
//        qtdPeca2 = sc.nextInt();
//        valorPeca2 = sc.nextDouble();
//
//        precoFinal = (qtdPeca1 * valorPeca1) + (qtdPeca2 * valorPeca2);
//        System.out.printf("VALOR A PAGAR: R$ %.2f%n", precoFinal);

        // Exercicio 06
        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangulo = A * C / 2.0;
        circulo = 3.14159 * C * C;
        trapezio = (A + B) / 2.0 * C;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);


        sc.close();
    }
}
