package entities;

import entities.enums.OrderStatus02;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order02 {
    private LocalDateTime moment;
    private OrderStatus02 status;
    private List<OrderItem> itens = new ArrayList<>();

    public Order02(LocalDateTime moment, OrderStatus02 status) {
        this.moment = moment;
        this.status = status;
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

    public List<OrderItem> getItens() {
        return itens;
    }

    public void addItem(OrderItem item) {
        itens.add(item);
    }

    public void removeItem(OrderItem item) {
        itens.remove(item);
    }

    public double total() {
        double total = 0.0;

        for (OrderItem item : itens) {
            total += item.subTotal();
        }

        return total;
    }

}
