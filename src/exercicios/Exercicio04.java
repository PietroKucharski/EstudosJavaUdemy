package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int x = 5;
//        int y = 0;
//
//        while (x > 2) {
//            System.out.println(x);
//            y += 1;
//            x -= 1;
//        }
//        int x = 2;
//        int y = 0;
//
//        while (x < 60) {
//            System.out.println(x);
//            System.out.println(y);
//            x *= 2;
//            y += 10;
//        }

//        double x = 100;
//        double y = 100;
//
//        while (x != y) {
//            System.out.println("olha");
//            x = Math.sqrt(y);
//        }


//        int senha = sc.nextInt();
//        int senhaValida = 2002;
//
//        while (senha != senhaValida) {
//            System.out.println("Senha inválida");
//            senha = sc.nextInt();
//        }
//
//        System.out.println("Acesso permitido");

//        int x, y;
//
//        x = sc.nextInt();
//        y = sc.nextInt();
//
//        while (x != 0 && y != 0) {
//            if (x > 0 && y > 0) {
//                System.out.println("Primeiro quadrante");
//            } else if (x < 0 && y > 0) {
//                System.out.println("Segundo quadrante");
//            } else if (x < 0 && y < 0) {
//                System.out.println("Terceiro quadrante");
//            } else {
//                System.out.println("Quarto quadrante");
//            }
//            x = sc.nextInt();
//            y = sc.nextInt();
//        }

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int tipo = sc.nextInt();

        while (tipo != 4) {
            if (tipo == 1) {
                alcool += 1;
            } else if (tipo == 2) {
                gasolina += 1;
            } else if (tipo == 3) {
                diesel += 1;
            }

            tipo = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        sc.close();
    }
}
