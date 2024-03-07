package com.learning.core.day3;

import java.util.Scanner;

public class D03P09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of strings:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter the strings:");
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }

        if (canFormCircle(strings)) {
            System.out.println("Yes");
            printCircularChaining(strings);
        } else {
            System.out.println("No");
        }
    }

    private static boolean canFormCircle(String[] strings) {
        if (strings.length == 0) {
            return false;
        }

        for (int i = 0; i < strings.length; i++) {
            if (isChained(strings, i, new boolean[strings.length], 1)) {
                return true;
            }
        }

        return false;
    }

    private static boolean isChained(String[] strings, int currentIdx, boolean[] visited, int count) {
        if (count == strings.length) {
            return strings[currentIdx].charAt(strings[currentIdx].length() - 1) == strings[0].charAt(0);
        }

        visited[currentIdx] = true;

        for (int i = 0; i < strings.length; i++) {
            if (!visited[i] && strings[currentIdx].charAt(strings[currentIdx].length() - 1) == strings[i].charAt(0)) {
                if (isChained(strings, i, visited, count + 1)) {
                    return true;
                }
            }
        }

        visited[currentIdx] = false;
        return false;
    }

    private static void printCircularChaining(String[] strings) {
        StringBuilder result = new StringBuilder();
        int[] sequence = new int[strings.length];
        boolean[] visited = new boolean[strings.length];

        if (findCircularChaining(strings, sequence, visited, 0)) {
            for (int idx : sequence) {
                result.append(strings[idx]).append(" ");
            }
            System.out.println(result.toString().trim());
        }
    }

    private static boolean findCircularChaining(String[] strings, int[] sequence, boolean[] visited, int count) {
        if (count == strings.length) {
            return true;
        }

        for (int i = 0; i < strings.length; i++) {
            if (!visited[i] && (count == 0 || strings[sequence[count - 1]].charAt(strings[sequence[count - 1]].length() - 1) == strings[i].charAt(0))) {
                visited[i] = true;
                sequence[count] = i;

                if (findCircularChaining(strings, sequence, visited, count + 1)) {
                    return true;
                }

                visited[i] = false;
            }
        }

        return false;
    }
}
