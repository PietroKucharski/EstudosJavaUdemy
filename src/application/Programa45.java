package application;

import java.io.File;
import java.util.Scanner;

public class Programa45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a file path: ");
        String strPath = sc.next();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName()); // Apenas o nome do arquivo
        System.out.println("getParent: " + path.getParent()); // Apenas o caminho sem o nome do arquivo
        System.out.println("getPath: " + path.getPath()); // Apenas o caminho completo
    }
}
