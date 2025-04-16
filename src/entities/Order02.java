package entities;

import entities.enums.OrderStatus02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order02 {
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime moment;
    private OrderStatus02 status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order02(LocalDateTime moment, OrderStatus02 status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus02 getStatus() {
        return status;
    }

    public void setStatus(OrderStatus02 status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double total = 0.0;

        for (OrderItem item : items) {
            total += item.subTotal();
        }

        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Order moment: ");
        sb.append(moment.format(dtf)).append("\n");
        sb.append("Order status: ").append(status).append("\n");
        sb.append("Client: ").append(client).append("\n");
        sb.append("Order items: ").append("\n");

        for (OrderItem item : items) {
            sb.append(item).append("\n");
        }
        sb.append("Total price: $").append(String.format("%.2f", total()));

        return sb.toString();
    }
}
