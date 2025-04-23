package application;

import entities.Product09;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Programa59 {
    public static void main(String[] args) {
        /*Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Pietro"); // Insere elementos dentro do map. Primeiro valor é a chave depois é o valor
        cookies.put("email", "pietro@email.com");
        cookies.put("phone", "1234567999");

        cookies.remove("email");
        cookies.put("phone", "12345678888");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email")); // retorna null pois não existe

        System.out.println("All cookies");

        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }*/

        Map<Product09, Double> stock = new HashMap<>();

        Product09 p1 = new Product09("Tv", 900.0);
        Product09 p2 = new Product09("Notebook", 1200.0);
        Product09 p3 = new Product09("Tablet", 400.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Product09 ps = new Product09("Tv", 900.0);
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }
}
