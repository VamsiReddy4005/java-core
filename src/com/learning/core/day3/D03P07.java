package com.learning.core.day3;

import java.util.Scanner;

public class D03P07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input String
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Print all subsequences
        System.out.print("Output: ");
        printAllSubsequences(inputString);
    }

    private static void printAllSubsequences(String str) {
        int n = str.length();

        for (int i = 0; i < (1 << n); i++) {
            StringBuilder subsequence = new StringBuilder();

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    subsequence.append(str.charAt(j));
                }
            }

            if (subsequence.length() > 0) {
                System.out.print(subsequence + ", ");
            }
        }
    }
}
