package com.learning.core.day7;

import java.util.Scanner;
import java.util.Stack;

public class D07P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        reverseStack(stack);

        printStack(stack);
    }

    private static void reverseStack(Stack<Character> stack) {
        if (!stack.isEmpty()) {
            char temp = stack.pop();
            reverseStack(stack);
            insertAtBottom(stack, temp);
        }
    }

    private static void insertAtBottom(Stack<Character> stack, char item) {
        if (stack.isEmpty()) {
            stack.push(item);
        } else {
            char temp = stack.pop();
            insertAtBottom(stack, item);
            stack.push(temp);
        }
    }

    private static void printStack(Stack<Character> stack) {
        for (char ch : stack) {
            System.out.print(ch);
        }
    }
}
