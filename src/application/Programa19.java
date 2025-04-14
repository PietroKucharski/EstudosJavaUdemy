package application;

import java.util.Scanner;

public class Programa19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Exercício sobre Matrizes
            Fazer um programa para ler dois números inteiros M e N, e depois ler
            uma matriz de M linhas por N colunas contendo números inteiros,
            podendo haver repetições. Em seguida, ler um número inteiro X que
            pertence à matriz. Para cada ocorrência de X, mostrar os valores à
            esquerda, acima, à direita e abaixo de X, quando houver, conforme exemplo.
        */

        int linhas = sc.nextInt();
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = sc.nextInt();
            }
        }

        int n = sc.nextInt();

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (matriz[linha][coluna] == n) {
                    System.out.println("Position " + linha + "," + coluna + ":");
                    if (coluna > 0) {
                        System.out.println("Left: " + matriz[linha][coluna - 1]);
                    }
                    if (linha > 0) {
                        System.out.println("Up: " + matriz[linha - 1][coluna]);
                    }
                    if (coluna < matriz[linha].length - 1) {
                        System.out.println("Right: " + matriz[linha][coluna + 1]);
                    }
                    if (linha < matriz.length - 1) {
                        System.out.println("Down: " + matriz[linha + 1][coluna]);
                    }
                }
            }
        }
    }
}
