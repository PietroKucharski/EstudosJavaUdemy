package application;

import entities.Employee05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Programa69 {
    public static void main(String[] args) {
        /*Exercício de fixação
        Fazer um programa para ler os dados (nome, email e salário) de funcionários a partir de um arquivo em formato .csv.
        Em seguida mostrar, em ordem alfabética, o email dos funcionários cujo salário seja superior a um dado valor
        fornecido pelo usuário. Mostrar também a soma dos salários dos funcionários cujo nome começa com a letra 'M'.
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();


        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Employee05> employee = new ArrayList<>();
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                String email = fields[1];
                double salary = Double.parseDouble(fields[2]);

                employee.add(new Employee05(name, email, salary));
                line = br.readLine();
            }

            System.out.print("Enter salary:");
            double employeeSalary = sc.nextDouble();


            Comparator<String> comp = (emp1, emp2) -> emp1.toUpperCase().compareTo(emp2.toUpperCase());

            List<String> emails = employee.stream().filter(emp -> emp.getSalary() > employeeSalary)
                    .map(emp -> emp.getEmail())
                    .sorted(comp).toList();

            System.out.printf("Email of people whose salary is more than %.2f\n", employeeSalary);
            emails.forEach(System.out::println);

            double sumOfSalary = employee.stream().filter(emp -> emp.getName().charAt(0) == 'M')
                    .map(emp -> emp.getSalary())
                    .reduce(0.0, (x, y) -> x + y);

            System.out.printf("Sum of salary of people whose name starts with 'M': %.2f", sumOfSalary);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
