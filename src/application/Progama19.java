package application;

import java.util.Scanner;

public class Progama19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
