package application;

import entities.Employee;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Programa04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: " + employee.name);
        employee.name = sc.nextLine();

        System.out.print("Gross salary: " + employee.grossSalary);
        employee.grossSalary = sc.nextDouble();

        System.out.print("Tax: " + employee.tax);
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee);
        System.out.println();

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Update data: " + employee);

        sc.close();
    }
}
