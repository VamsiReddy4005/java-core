package com.learning.core.day7;

import java.util.Scanner;
import java.util.Stack;

public class D07P07 {
    public static boolean isTopElementEven(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int topElement = stack.peek();
            return topElement % 2 == 0;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter elements for the stack: ");
        String[] inputValues = scanner.nextLine().split(" ");
        Stack<Integer> stack = new Stack<>();

        for (String value : inputValues) {
            stack.push(Integer.parseInt(value));
        }

        boolean isEven = isTopElementEven(stack);

        System.out.println("Output: " + isEven);
    }
}
