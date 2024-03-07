package com.learning.core.day5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D05P04 {
    public static void main(String[] args) {
        // Problem 4: Create a Product class with Product Id & Product Name
        // and store product details in a HashSet
        Set<Product> productSet = new HashSet<>();
        productSet.add(new Product("P001", "Maruti 800"));
        productSet.add(new Product("P002", "Maruti Zen"));
        productSet.add(new Product("P003", "Maruti Dezire"));
        productSet.add(new Product("P004", "Maruti Alto"));

        // Input: Search for a particular product
        //Scanner sc= new Scanner(System.in);
        //String searchInput=sc.nextLine();        String searchInput = "P003 Maruti Dezire";

        // Split the input string into product details
        String[] searchDetails = searchInput.split("\\s+");
        String searchProductId = searchDetails[0];
        String searchProductName = searchDetails[1];

        // Check if the specified product is found in the HashSet
        if (productSet.contains(new Product(searchProductId, searchProductName))) {
            System.out.println("Output: Product Found");
        } else {
            System.out.println("Output: Product Not Found");
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Product product = (Product) obj;
        return productId.equals(product.productId) && productName.equals(product.productName);
    }

    @Override
    public int hashCode() {
        return productId.hashCode() + productName.hashCode();
    }
}
