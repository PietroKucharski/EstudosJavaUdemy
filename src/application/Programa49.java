package application;

import entities.Employee04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa49 {
    public static void main(String[] args) {

        List<Employee04> list = new ArrayList<>();
        String path = "C:\\Users\\pietr\\Documents\\JavaUdemy\\Arquivos_teste\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCsv = br.readLine();

            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                list.add(new Employee04(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }

            Collections.sort(list);

            for (Employee04 employee: list) {
                System.out.println(employee.getName() + ", " + employee.getSalary());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
