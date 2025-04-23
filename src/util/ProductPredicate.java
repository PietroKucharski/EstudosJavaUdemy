package util;

import entities.Product11;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product11> {
    @Override
    public boolean test(Product11 product) {
        return product.getPrice() >= 100.0;
    }
}
