package com.learning.core.day3;

import java.util.Scanner;

public class D03P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Output
        int result = findFirstRepeatingIndex(arr);
        System.out.println(result);
    }

    private static int findFirstRepeatingIndex(int[] arr) {
        int[] lastIndex = new int[100000]; // Assuming the elements are in the range [1, 100000]
        int result = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            int index = arr[i];
            if (lastIndex[index] != 0) {
                result = lastIndex[index];
            } else {
                lastIndex[index] = i + 1; // Adjusting the index to be 1-based
            }
        }

        return result;
    }
}
