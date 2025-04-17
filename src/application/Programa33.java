package application;

import entities.*;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa33 {
    public static void main(String[] args) {
        /*Exercicio resolvido
        Fazer um programa para ler os dados de N figuras (N fornecido pelo usuário), e depois mostrar as áreas destas
        figuras na mesma ordem em que foram digitadas.
        Class Shape -> color:Color; area():Double;
        Enum Color -> BLACK, RED, BLUE;
        Class Rectangle -> width:Double; height:Double;
        Class Circle -> radius:Double;
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Shape #%d data:\n", i + 1);

            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Height: ");
                double height = sc.nextDouble();

                list.add(new Rectangle02(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                list.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");
        for (Shape shape : list) {
            System.out.printf("%.2f%n", shape.area());
        }
    }
}
