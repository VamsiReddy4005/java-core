package com.learning.core.day9;

import java.util.Scanner;

class LinearSearch
{
    public int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
}
}
public class D09P03 {
    public static void main(String[] args) {
    	LinearSearch l=new LinearSearch();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();

        int result = l.linearSearch(arr, target);
        if (result == -1) 
        {
            System.out.println("Element is not present");
        } 
        else 
        {
            System.out.println("Element is present");
        }
        scanner.close();
    }
}

    

