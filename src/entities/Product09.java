package entities;

import java.util.Objects;

public class Product09 {
    private String name;
    private Double price;

    public Product09(String name, Double price) {
        this.name = name;
        this.price = price;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product09 product09 = (Product09) o;
        return Objects.equals(name, product09.name) && Objects.equals(price, product09.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
