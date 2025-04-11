package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Faz com que seja aceito o ponto ao invés da virgula de separador
        Scanner sc = new Scanner(System.in);

//        String x;
//        x = sc.next(); // Permite escrever uma palavra que será armazenada na variável x

//        int x;
//        x = sc.nextInt(); // Permite escrever um número inteiro que será armazenado na variável x

//        double x;
//        x = sc.nextDouble(); // Permite escrever um número de ponto flutuante que será armazenado na variável x
//
//        System.out.println("Você digitou: " + x);
//        System.out.printf("Você digitou: %.2f%n", x); // Faz com que o separador seja uma vírugla e não um ponto

//        char x;
//        x = sc.next().charAt(1); // Irá armazenar na variável apenas o caractere que estiver dentro dos parênteses do charAt

        String x;
        int y;
        double z;

        // Leitura de dados na mesma linha separados por espaço: Pietro = x, 23 = y, 4.5 = z
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Você digitou:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}
