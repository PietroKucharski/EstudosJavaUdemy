package services;

import entities.Product14;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
    public double filteredSum(List<Product14> list, Predicate<Product14> criteria) {
        double sum = 0.0;

        for (Product14 product: list) {
            if(criteria.test(product)) {
                sum += product.getPrice();
            }
        }
        return sum;
    }
}
