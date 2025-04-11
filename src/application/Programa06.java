package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Programa06 {
    // Primeira versão
//    public static final double PI = 3.14159; // A palavra final faz com que ele fale que a variável é constante
//
//    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter radius: ");
//        double radius = sc.nextDouble();
//
//        double c = circumference(radius);
//
//        double v = volume(radius);
//
//        System.out.printf("Circumference: %.2f%n", c);
//        System.out.printf("Volume: %.2f%n", v);
//        System.out.printf("PI value: %.2f%n", PI);
//
//        sc.close();
//    }
//
//    public static double circumference(double radius) {
//        return 2.0 * PI * radius;
//    }
//
//    public static double volume(double radius) {
//        return 4.0 * PI * Math.pow(radius, 3) / 3.0;
//    }

    // Segunda versão

//    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        Calculator calculator = new Calculator();
//
//        System.out.println("Enter radius: ");
//        double radius = sc.nextDouble();
//
//        double c = calculator.circumference(radius);
//
//        double v = calculator.volume(radius);
//
//        System.out.printf("Circumference: %.2f%n", c);
//        System.out.printf("Volume: %.2f%n", v);
//        System.out.printf("PI value: %.2f%n", calculator.PI);
//
//        sc.close();
//    }

    // Terceira versão

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        sc.close();
    }
}
