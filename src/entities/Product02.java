package entities;

public class Product02 {
    public String name;
    public double price;
    public int quantity;

    public Product02() {
    }

    public Product02(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product02(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }
}
