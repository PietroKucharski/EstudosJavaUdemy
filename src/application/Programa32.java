package application;

import entities.ImportedProduct;
import entities.Product06;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa32 {
    public static void main(String[] args) {
        /*Exercicio de fixação
        Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário). Ao final,
        mostrar a etiqueta de preço de cada produto na mesma ordem em que foram digitados.
        Todo produto possui nome e preço. Produtos importados possuem uma taxa de alfândega, e
        produtos usados possuem data de fabricação. Estes dados específicos devem ser
        acrescentados na etiqueta de preço conforme exemplo (próxima página). Para produtos
        importados, a taxa e alfândega dev
        Class Product - name:String; price:Double; priceTag():String
        Class ImportedProduct - customFee:Double; totalPrice():Double; priceTag():String;
        Class UsedProduct - manufactureDate:LocalDate; priceTag():String;
        */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.print("Enter the number of products: ");
        int numberOfProducts = sc.nextInt();

        List<Product06> products = new ArrayList<>();

        for (int i = 0; i < numberOfProducts; i++) {
            System.out.printf("Product #%d data:\n", i + 1);

            System.out.print("Common, used or imported (c/u/i)? ");
            char productType = sc.next().charAt(0);
            sc.nextLine();

            if (productType == 'c') {
                System.out.print("Name: ");
                String productName = sc.next();

                System.out.print("Price: ");
                double productPrice = sc.nextDouble();

                products.add(new Product06(productName, productPrice));
            } else if (productType == 'u') {
                System.out.print("Name: ");
                String productName = sc.next();

                System.out.print("Price: ");
                double productPrice = sc.nextDouble();

                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String manufactureDate = sc.next();

                products.add(new UsedProduct(productName, productPrice, LocalDate.parse(manufactureDate, dtf)));
            } else {
                System.out.print("Name: ");
                String productName = sc.next();

                System.out.print("Price: ");
                double productPrice = sc.nextDouble();

                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();

                products.add(new ImportedProduct(productName, productPrice, customsFee));
            }
        }

        System.out.println("PRICE TAGS");
        for (Product06 product : products) {
            System.out.println(product.priceTag());
        }
    }
}
