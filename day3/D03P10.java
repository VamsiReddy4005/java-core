package com.learning.core.day3;

import java.util.Scanner;

public class D03P10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        String input = scanner.nextLine();

        int result = findLongestPrefixSuffixLength(input);
        System.out.println("Output: " + result);
    }

    private static int findLongestPrefixSuffixLength(String str) {
        int n = str.length();

        for (int len = n - 1; len > 0; len--) {
            String prefix = str.substring(0, len);
            String suffix = str.substring(n - len, n);

            if (prefix.equals(suffix)) {
                return len;
            }
        }

        return 0;
    }
}

