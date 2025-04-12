package application;

import entities.Employee02;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa17 {
    public static void main(String[] args) {

        /*Exercicio proposto
        Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
        N funcionários. Não deve haver repetição de id.
        Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
        Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
        mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
        conforme exemplos.Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
        ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee02> listEmployees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d\n", i + 1);

            System.out.print("Id: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee02 newEmployee = new Employee02(id, name, salary);

            listEmployees.add(newEmployee);
        }


        System.out.print("Enter the employee id that will have salary increase : ");
        int id = sc.nextInt();
        Employee02 result = listEmployees.stream().filter(employee02 -> employee02.getId() == id).findFirst().orElse(null);

        if(result == null) {
            System.out.println("This id does not exist!");
            System.out.println("List of employees:");

            for (Employee02 listEmployee : listEmployees) {
                System.out.println(listEmployee);
            }
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();

            result.increaseSalary(percentage);
            for (Employee02 listEmployee : listEmployees) {
                System.out.println(listEmployee);
            }
        }



    }
}
