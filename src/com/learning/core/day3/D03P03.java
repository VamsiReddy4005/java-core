package com.learning.core.day3;

import java.util.Scanner;

public class D03P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[18];
        System.out.println("Enter 18 integer values:");
        for (int i = 0; i < 18; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < 15; i++) {
            sum += arr[i];
        }
        arr[15] = sum;

        double average = (double) sum / 15;
        arr[16] = (int) Math.round(average);

        int smallest = arr[0];
        for (int i = 1; i < 15; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        arr[17] = smallest;

        for (int value : arr) {
            System.out.print(value);
        }
    }
}
