package application;

import entities.Rent;

import java.util.Scanner;

public class Programa14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Desafio de fixação
            A dona de um pensionato possui dez quartos para alugar para estudantes,
            sendo esses quartos identificados pelos números 0 a 9.
            Fazer um programa que inicie com todos os dez quartos vazios, e depois
            leia uma quantidade N representando o número de estudantes que vão
            alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
            N estudantes. Para cada registro de aluguel, informar o nome e email do
            estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
            que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
            um relatório de todas ocupações do pensionato, por ordem de quarto,
            conforme exemplo
        */

        /* Opção sem criar classe */

        /* System.out.print("How many rooms will be rented? ");
        int qtdQuartosParaAlugar = sc.nextInt();
        int quartoEscolheu = 0;
        int qtdQuartos = 10;

        int[] quarto = new int[qtdQuartos];
        String[] nomes = new String[qtdQuartos];
        String[] emails = new String[qtdQuartos];

        for (int i = 0; i < qtdQuartosParaAlugar; i++) {
            String nome, email;
            System.out.printf("Rent #%d:\n", i + 1);

            sc.nextLine();
            System.out.print("Name: ");
            nome = sc.nextLine();

            System.out.print("Email: ");
            email = sc.nextLine();

            System.out.print("Room: ");
            quartoEscolheu = sc.nextInt();
            System.out.println();

            nomes[quartoEscolheu] = nome;
            emails[quartoEscolheu] = email;
            quarto[quartoEscolheu] = quartoEscolheu;
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < qtdQuartos; i++) {
            if (quarto[i] != 0) {
                System.out.printf("%d: %s, %s\n", quarto[i], nomes[i], emails[i]);
            }
        }*/

        /* Opção com criação de classe Rent*/
        Rent[] rents = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int room = sc.nextInt();

            rents[room] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if (rents[i] != null) {
                System.out.println(i + ": " + rents[i]);
            }
        }
    }
}
