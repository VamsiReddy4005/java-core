package com.learning.core.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class D03P11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dictionary strings (separated by space):");
        String[] dictionary = scanner.nextLine().split("\\s+");

        System.out.println("Enter the pattern:");
        String pattern = scanner.nextLine();

        List<String> matchingStrings = findMatchingStrings(dictionary, pattern);

        System.out.println("Output:");
        for (String match : matchingStrings) {
            System.out.print(match + " ");
        }
    }

    private static List<String> findMatchingStrings(String[] dictionary, String pattern) {
        List<String> result = new ArrayList<>();

        for (String word : dictionary) {
            if (isMatch(word, pattern)) {
                result.add(word);
            }
        }

        return result;
    }

    private static boolean isMatch(String word, String pattern) {
        if (word.length() != pattern.length()) {
            return false;
        }

        int n = word.length();
        char[] map = new char[26];
        Arrays.fill(map, '\0');

        for (int i = 0; i < n; i++) {
            char patternChar = pattern.charAt(i);
            char wordChar = word.charAt(i);

            if (map[patternChar - 'a'] == '\0') {
                map[patternChar - 'a'] = wordChar;
            } else if (map[patternChar - 'a'] != wordChar) {
                return false;
            }
        }

        return true;
    }
}
