package com.learning.core.day5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class D05P05 {
    public static void main(String[] args) {
        Set<Product> productSet = new HashSet<>();
        productSet.add(new Product("P001", "Maruti 800"));
        productSet.add(new Product("P002", "Maruti Zen"));
        productSet.add(new Product("P003", "Maruti Dezire"));
        productSet.add(new Product("P004", "Maruti Alto"));

       
        String removeProductId = "P002";

        
        Iterator<Product> iterator = productSet.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getProductId().equals(removeProductId)) {
                iterator.remove();
            }
        }

        
        System.out.println("Output:");
        for (Product product : productSet) {
            System.out.println(product);
        }
    }
}

class Product {
    private String productId;
    private String productName;

    public Product2(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return productId + " " + productName;
    }
}

