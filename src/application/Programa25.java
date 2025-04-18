package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Programa25 {
    public static void main(String[] args) {
        /*Exercício resolvido
        Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
        do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo
        Class Worker - name:String; level:WorkerLevel; baseSalary:Doube; addContract(contract: HourContract):void; removeContract(contract: HourContract):void; income(year:Integer, month:Double):Double
        Class HourContract - date:LocalDate; valuePerHour:Double; hours:Integer; totalValue():Double
        Class Department - name:String
        Class Enum - JUNIOR:int; MID_LEVEL:int; SENIOR:int;
        * */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();

        System.out.println("Enter worker data: ");

        System.out.print("Name: ");
        String workerName = sc.nextLine();

        System.out.print("Level: ");
        String workerLevel = sc.nextLine();

        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int nContract = sc.nextInt();

        for (int i = 0; i < nContract; i++) {
            System.out.printf("Enter contract #%d data:\n", i + 1);


            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate contractDate = LocalDate.parse(sc.next(), dtf);

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Name: " + worker.getDepartment().getName());
        System.out.println("Name: " + monthAndYear + ": " + String.format("%.2f", worker.income(month, year)));
    }
}
