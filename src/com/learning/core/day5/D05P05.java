package com.learning.core.day5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class D05P05 {
    public static void main(String[] args) {
        Set<Product2> productSet = new HashSet<>();
        productSet.add(new Product2("P001", "Maruti 800"));
        productSet.add(new Product2("P002", "Maruti Zen"));
        productSet.add(new Product2("P003", "Maruti Dezire"));
        productSet.add(new Product2("P004", "Maruti Alto"));

       
        String removeProductId = "P002";

        
        Iterator<Product2> iterator = productSet.iterator();
        while (iterator.hasNext()) {
            Product2 product = iterator.next();
            if (product.getProductId().equals(removeProductId)) {
                iterator.remove();
            }
        }

        
        for (Product2 product : productSet) {
            System.out.println(product);
        }
    }
}

class Product2 {
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
