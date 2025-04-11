package application;

import java.util.Locale;
import java.util.Scanner;

public class Programa13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        Exercicio 01
        Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
        e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
        */

        /*
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS");


        for (int i = 0; i < n; i++) {
            if (vetor[i] < 0) {
                System.out.printf("%d\n", vetor[i]);
            }
        }*/

        /*
        Exercicio 02
        Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        - Imprimir todos os elementos do vetor
        - Mostrar na tela a soma e a média dos elementos do vetor
        */

        /*
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        double media = soma / n;

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("VALORES = %.1f ", vetor[i]);
        }

        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);*/

        /*
        Exercicio 03
        Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
        tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
        bem como os nomes dessas pessoas caso houver
        */

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);

            System.out.print("Nome: ");
            name[i] = sc.next();

            System.out.print("Idade: ");
            idade[i] = sc.nextInt();

            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }

        double somaDasAlturas = 0.0;

        for (int i = 0; i < n; i++) {
            somaDasAlturas += altura[i];
        }

        double mediaDasAlturas = somaDasAlturas / n;

        int qtdMenor = 0;

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                qtdMenor++;
            }
        }

        double procentMenorIdade = ((double) qtdMenor / n) * 100.0;


        System.out.printf("\nAltura media = %.2f\n", mediaDasAlturas);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", procentMenorIdade);

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                System.out.printf("%s\n", name[i]);
            }
        }
    }
}
