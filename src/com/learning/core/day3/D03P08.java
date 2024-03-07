package com.learning.core.day3;

import java.util.Scanner;

public class D03P08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input String
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Calculate minimum deletions
        int minDeletions = calculateMinDeletions(inputString);

        // Output
        System.out.println("Output: " + minDeletions);
    }

    private static int calculateMinDeletions(String str) {
        int n = str.length();
        int[][] dp = new int[n][n];

        // Find the length of the longest palindromic subsequence
        int lpsLength = longestPalindromicSubsequence(str, dp);

        // Minimum deletions = Length of string - Length of longest palindromic subsequence
        return n - lpsLength;
    }

    private static int longestPalindromicSubsequence(String str, int[][] dp) {
        int n = str.length();

        for (int i = 0; i < n; i++) {
            dp[i][i] = 1; // Each character is a palindrome of length 1
        }

        for (int cl = 2; cl <= n; cl++) {
            for (int i = 0; i < n - cl + 1; i++) {
                int j = i + cl - 1;
                if (str.charAt(i) == str.charAt(j) && cl == 2) {
                    dp[i][j] = 2;
                } else if (str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
                }
            }
        }

        return dp[0][n - 1];
    }
}

