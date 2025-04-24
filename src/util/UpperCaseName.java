package util;

import entities.Product13;

import java.util.function.Function;

public class UpperCaseName implements Function<Product13, String> {
    @Override
    public String apply(Product13 product) {
        return product.getName().toUpperCase();
    }
}
