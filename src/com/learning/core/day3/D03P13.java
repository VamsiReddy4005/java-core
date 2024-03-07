package com.learning.core.day3;

import java.util.Scanner;

public class D03P13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        String input = scanner.nextLine();

        String result = replaceSpaces(input);
        System.out.println("Output:");
        System.out.println(result);
    }

    private static String replaceSpaces(String str) {
        return str.replaceAll(" ", "%20");
    }
}
