package application;

import java.util.Scanner;

public class Programa18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n]; // Faz a instanciação da matriz em memória

        for (int i = 0; i < matriz.length; i++) { // Irá percorrer as linhas
            for (int j = 0; j < matriz[i].length; j++) { // Irá percorrer as colunas
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println();
        int countNegativos = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] < 0) {
                    countNegativos++;
                }
            }
        }

        System.out.println(countNegativos);
    }
}
