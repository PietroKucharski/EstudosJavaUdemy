package application;

import entities.Product14;
import services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Programa65 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product14> list = new ArrayList<>();

        list.add(new Product14("Tv", 900.00));
        list.add(new Product14("Mouse", 50.00));
        list.add(new Product14("Tablet", 350.50));
        list.add(new Product14("HD Case", 80.90));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');

        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}
