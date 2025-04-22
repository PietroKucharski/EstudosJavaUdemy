package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Programa40 {
    public static void main(String[] args) {
        Scanner sc = null;
        File file = new File("C:\\Users\\pietr\\Documents\\JavaUdemy\\Arquivos_teste\\in.txt");

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
