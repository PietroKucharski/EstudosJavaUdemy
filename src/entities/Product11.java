package entities;

public class Product11 {
    private String name;
    private Double price;

    public Product11(String name, Double price) {
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

    public static boolean staticProductPredicate(Product11 product) {
        return product.getPrice() >= 100.00;
    }

    public boolean nonStaticProductPredicate() {
        return price >= 100.00;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
}
