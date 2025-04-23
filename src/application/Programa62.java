package application;

import entities.Product11;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Programa62 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product11> list = new ArrayList<>();

        list.add(new Product11("Tv", 900.00));
        list.add(new Product11("Mouse", 50.00));
        list.add(new Product11("Tablet", 350.50));
        list.add(new Product11("HD Case", 80.90));

        /*list.removeIf(p -> p.getPrice() >= 100);*/
        /*list.removeIf(new ProductPredicate());*/
        /*list.removeIf(Product11::staticProductPredicate); // Method reference -> Referencia de metodo*/
        /*list.removeIf(Product11::nonStaticProductPredicate);*/

        /*Predicate<Product11> pred = p -> p.getPrice() >= 100.00;
        list.removeIf(pred);*/

        list.removeIf(p -> p.getPrice() >= 100.00);

        for (Product11 product : list) {
            System.out.println(product);
        }
    }
}
