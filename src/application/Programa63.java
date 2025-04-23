package application;

import entities.Product12;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Programa63 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product12> list = new ArrayList<>();

        list.add(new Product12("Tv", 900.00));
        list.add(new Product12("Mouse", 50.00));
        list.add(new Product12("Tablet", 350.50));
        list.add(new Product12("HD Case", 80.90));

        /*list.forEach(new PriceUpdate());*/
        /*list.forEach(Product12::staticPriceUpdate);*/
        /*list.forEach(Product12::nonStaticPriceUpdate);*/

        /*Consumer<Product12> cons = p -> p.setPrice(p.getPrice() * 1.1);
        list.forEach(cons);*/

        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

        list.forEach(System.out::println);
    }
}
