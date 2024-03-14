package com.learning.core.day5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D05P04 {
    public static void main(String[] args) {
        Set<Product3> productSet = new HashSet<>();
        productSet.add(new Product3("P001", "Maruti 800"));
        productSet.add(new Product3("P002", "Maruti Zen"));
        productSet.add(new Product3("P003", "Maruti Dezire"));
        productSet.add(new Product3("P004", "Maruti Alto"));

        Scanner sc= new Scanner(System.in);
        String searchInput=sc.nextLine();        
        String[] searchDetails = searchInput.split("\\s+",2);
        String searchProductId = searchDetails[0];
        String searchProductName = searchDetails[1];

        if (productSet.contains(new Product3(searchProductId, searchProductName))) 
        {
            System.out.println("Output: Product Found");
        } 
        else 
        {
            System.out.println("Output: Product Not Found");
        }
    }
}

class Product3 {
    private String productId;
    private String productName;

    public Product3(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Product3 product = (Product3) obj;
        return productId.equals(product.productId) && productName.trim().equals(product.productName.trim());
    }


    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + productId.hashCode();
        result = 31 * result + productName.hashCode();
        return result;
    }

}
