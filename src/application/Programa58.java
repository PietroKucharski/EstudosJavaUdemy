package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa58 {
    public static void main(String[] args) {
        /*Exercicio de fixação
        Em um portal de cursos online, cada usuário possui um código único, representado por um número inteiro. Cada
        instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se matricular em quantos cursos quiser.
        Assim, o número total de alunos de um instrutor não é simplesmente a soma dos alunos de todos os cursos que ele
        possui, pois pode haver alunos repetidos em mais de um curso. O instrutor Alex possui três cursos A, B e C, e
        deseja saber seu número total de alunos. Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex,
        depois mostrar a quantidade total e alunos dele,
        * */
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("How many students for course A? ");
        int courseA = sc.nextInt();

        for (int i = 0; i < courseA; i++) {
            int studentCode = sc.nextInt();
            a.add(studentCode);
        }

        System.out.print("How many students for course B? ");
        int courseB = sc.nextInt();

        for (int i = 0; i < courseB; i++) {
            int studentCode = sc.nextInt();
            b.add(studentCode);
        }

        System.out.print("How many students for course C? ");
        int courseC = sc.nextInt();

        for (int i = 0; i < courseC; i++) {
            int studentCode = sc.nextInt();
            c.add(studentCode);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.print("Total students: " + total.size());
    }
}
