package application;

import entities.Product10;

import java.util.ArrayList;
import java.util.List;

public class Programa61 {
    public static void main(String[] args) {
        List<Product10> list = new ArrayList<>();

        list.add(new Product10("TV", 900.00));
        list.add(new Product10("Notebook", 1200.00));
        list.add(new Product10("Tablet", 450.00));
        /*Comparator<Product10> comp = new Comparator<Product10>() {
            @Override
            public int compare(Product10 p1, Product10 p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };*/

        /*Comparator<Product10> comp = (p1, p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };*/

        /*Comparator<Product10> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());*/

        /*list.sort(new MyComparator());*/
        /*list.sort(comp);*/
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
        for (Product10 product : list) {
            System.out.println(product);
        }
    }
}
