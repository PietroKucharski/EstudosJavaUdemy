package util;

import entities.Product12;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product12> {

    @Override
    public void accept(Product12 product) {
        product.setPrice(product.getPrice() * 1.1);
    }
}
