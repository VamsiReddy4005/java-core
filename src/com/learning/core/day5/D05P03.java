package com.learning.core.day5;

import java.util.HashSet;
import java.util.Set;

public class D05P03 {
    public static void main(String[] args) {
       
        Set<Product> productSet = new HashSet<>();
        productSet.add(new Product("P001", "Maruti 800"));
        productSet.add(new Product("P002", "Maruti Zen"));
        productSet.add(new Product("P003", "Maruti Dezire"));
        productSet.add(new Product("P004", "Maruti Alto"));

      for (Product product : productSet) {
            System.out.println(product);
        }
    }
}

class Product {
    private String productId;
    private String productName;

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return productId + " " + productName;
    }
}