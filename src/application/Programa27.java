package application;

import entities.*;
import entities.enums.OrderStatus02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Programa27 {
    public static void main(String[] args) {
        /*Exercicio
        Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
        sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser
        o instante do sistema: new Date()
        * */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter birthFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter cliente data:");

        System.out.print("Name: ");
        String clientName = sc.nextLine();

        System.out.print("Email: ");
        String clientEmail = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        String clientBirthDate = sc.nextLine();

        System.out.println("Enter order data:");

        System.out.print("Status: ");
        String orderStatus = sc.next();

        Client client = new Client(clientName, clientEmail, LocalDate.parse(clientBirthDate, birthFormatter));

        System.out.print("How many items to this order? ");
        int orders = sc.nextInt();

        Order02 order = new Order02(LocalDateTime.now(), OrderStatus02.valueOf(orderStatus));

        for (int i = 0; i < orders; i++) {
            sc.nextLine();
            System.out.printf("Enter #%d item data\n", i + 1);

            System.out.print("Product name: ");
            String productName = sc.next();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();

            Product05 product = new Product05(productName, productPrice);
            OrderItem item = new OrderItem(productQuantity, productPrice, product);

            order.addItem(item);
        }

        System.out.println("ORDER SUMMARY:");
        System.out.print("Order moment: " + order.getMoment().format(dtf));
        System.out.print("\nOrder status: " + order.getStatus() + "\n");
        System.out.print("Client: " + client);
        System.out.print("\nOrder items:\n");
        for (OrderItem item : order.getItens()) {
            System.out.println(item);
        }
        System.out.printf("Total price: $%.2f", order.total());
    }
}
