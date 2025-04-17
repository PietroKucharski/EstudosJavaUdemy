package application;

import entities.Employee03;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa31 {
    public static void main(String[] args) {
        /*Exercicio resolvido
        Uma empresa possui funcionários próprios e terceirizados. Para cada funcionário, deseja-se registrar nome, horas
        trabalhadas e valor por hora. Funcionários terceirizado possuem ainda uma despesa adicional.
        O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas trabalhadas, sendo que os
        funcionários terceirizados ainda recebem um bônus correspondente a 110% de sua despesa adicional.
        Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário) e armazená-los em uma lista.
        Depois de ler todos os dados, mostrar nome e pagamento de cada funcionário na mesma ordem em que foram digitados.
        Construa o programa conforme projeto ao lado. Vejaexemplo na próxima página.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee03> employeeList = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int numberEmployees = sc.nextInt();

        for (int i = 0; i < numberEmployees; i++) {
            System.out.printf("Employee #%d data:\n", i + 1);

            System.out.print("Outsourced (y/n)? ");
            char isOutsourced = sc.next().charAt(0);

            System.out.print("Name: ");
            String employeeName = sc.next();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (isOutsourced == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                employeeList.add(new OutsourcedEmployee(employeeName, hours, valuePerHour, additionalCharge));
            } else {
                employeeList.add(new Employee03(employeeName, hours, valuePerHour));

            }

        }

        System.out.println();
        System.out.println("PAYMENTS:");

        for (Employee03 employee : employeeList) {
            System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
        }
    }
}
