package application;

import entities.Product15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Programa68 {
    public static void main(String[] args) {
        /*Exercício resolvido
        Fazer um programa para ler um conjunto de produtos a partir de umarquivo em formato .csv
        (suponha que exista pelo menos um produto). Em seguida mostrar o preço médio dos produtos. Depois, mostrar os
        nomes, em ordem decrescente, dos produtos que possuem preço inferior ao preço médio
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Product15> list = new ArrayList<>();

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product15(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            double avg = list.stream().
                    map(p -> p.getPrice()).reduce(0.0, (x, y) -> x + y) / list.size();

            System.out.println("Average price: " + String.format("%.2f", avg));
            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream().filter(p -> p.getPrice() < avg).map(p -> p.getName()).
                    sorted(comp.reversed()).toList();

            names.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
