package entities;

public class Product07 {
    private String name;
    private Double price;
    private Integer quantity;

    public Product07() {
    }

    public Product07(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double totalValue() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return name + ", " + price + ", " + quantity;
    }
}
