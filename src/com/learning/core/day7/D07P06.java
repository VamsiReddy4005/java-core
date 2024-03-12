package com.learning.core.day7;

import java.util.Scanner;
import java.util.Stack;

public class D07P06 {
    public static int findMinElement(Stack<Integer> stack) {
        Stack<Integer> minStack = new Stack<>();

        while (!stack.isEmpty()) {
            int element = stack.pop();
            if (minStack.isEmpty() || element < minStack.peek()) {
                minStack.push(element);
            }
        }

        return minStack.peek();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputValues = scanner.nextLine().split(" ");
        Stack<Integer> stack = new Stack<>();

        for (String value : inputValues) {
            stack.push(Integer.parseInt(value));
        }

        int minElement = findMinElement(stack);

        System.out.println(minElement);
    }
}
