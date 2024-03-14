package com.learning.core.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D05P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentNamesInput = scanner.nextLine();
        List<String> studentNames = new ArrayList<>();
        
 
        for (String name : studentNamesInput.split("\\s+")) {
            studentNames.add(name);
        }

        String searchName = scanner.nextLine();
        
        
        if (studentNames.contains(searchName)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        scanner.close();
    }
}