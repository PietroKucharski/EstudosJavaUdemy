package application;

import entities.Product08;
import services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Programa52 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product08> list = new ArrayList<>();

        String path = "C:\\Users\\pietr\\Documents\\JavaUdemy\\Arquivos_teste\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product08(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            Product08 x = CalculationService.max(list);
            System.out.println("Most expensive: ");
            System.out.println(x);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
