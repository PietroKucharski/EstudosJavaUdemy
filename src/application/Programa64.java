package application;

import entities.Product13;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Programa64 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product13> list = new ArrayList<>();

        list.add(new Product13("Tv", 900.00));
        list.add(new Product13("Mouse", 50.00));
        list.add(new Product13("Tablet", 350.50));
        list.add(new Product13("HD Case", 80.90));

        /*List<String> names = list.stream().map(new UpperCaseName()).toList();
         names.forEach(System.out::println);
         */

        /*List<String> names = list.stream().map(Product13::staticUpperCaseName).toList();
        names.forEach(System.out::println);*/

        /*List<String> names = list.stream().map(Product13::nonStaticUpperCaseName).toList();
        names.forEach(System.out::println);*/

        /*Function<Product13, String> func = p -> p.getName().toUpperCase();

        List<String> names = list.stream().map(func).toList();
        names.forEach(System.out::println);*/

        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).toList();
        names.forEach(System.out::println);
    }
}
