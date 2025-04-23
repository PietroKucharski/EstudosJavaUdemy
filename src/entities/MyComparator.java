package entities;

import java.util.Comparator;

public class MyComparator implements Comparator<Product10> {
    @Override
    public int compare(Product10 p1, Product10 p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
