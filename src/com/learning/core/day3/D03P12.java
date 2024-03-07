package com.learning.core.day3;

import java.util.Scanner;

public class D03P12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        String input = scanner.nextLine();

        if (canSplitIntoFourStrings(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean canSplitIntoFourStrings(String str) {
        if (str.length() < 4) {
            return false;
        }

        int n = str.length();
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    String s1 = str.substring(0, i);
                    String s2 = str.substring(i, j);
                    String s3 = str.substring(j, k);
                    String s4 = str.substring(k);

                    if (!s1.equals(s2) && !s1.equals(s3) && !s1.equals(s4) && !s2.equals(s3) && !s2.equals(s4) && !s3.equals(s4)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}

