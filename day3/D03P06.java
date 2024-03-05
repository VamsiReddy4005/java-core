package com.learning.core.day3;

import java.util.Scanner;

public class D03P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input String
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Input value of 'n'
        System.out.print("Enter the value of 'n': ");
        int n = scanner.nextInt();

        // Count the last 'n' vowels
        String lastNVowels = countLastNVowels(inputString, n);

        // Output
        System.out.println("Output: " + lastNVowels);
    }

    private static String countLastNVowels(String inputString, int n) {
        int vowelCount = 0;
        StringBuilder lastNVowels = new StringBuilder();

        for (int i = inputString.length() - 1; i >= 0; i--) {
            char currentChar = inputString.charAt(i);

            if (isVowel(currentChar)) {
                lastNVowels.insert(0, currentChar); // Add vowels in reverse order
                vowelCount++;

                if (vowelCount == n) {
                    break; // Stop when 'n' vowels are found
                }
            }
        }

        // Check for mismatch in vowel count
        if (vowelCount < n) {
            return "Mismatch in Vowel Count";
        }

        return lastNVowels.toString();
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
