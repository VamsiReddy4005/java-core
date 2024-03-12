package com.learning.core.day7;

import java.util.Scanner;

class CharNode {
    char value;
    CharNode next;

    public CharNode(char value) {
        this.value = value;
        this.next = null;
    }
}

class CharStack {
    CharNode top;

    public CharStack() {
        this.top = null;
    }

    public void push(char value) {
        CharNode newNode = new CharNode(value);
        newNode.next = top;
        top = newNode;
    }

    public Character pop() {
        if (top != null) {
            char poppedValue = top.value;
            top = top.next;
            return poppedValue;
        } else {
            return null;
        }
    }

    public void display() {
        CharNode current = top;
        while (current != null) {
            System.out.print(current.value);
            current = current.next;
        }
    }
}

public class D07P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        CharStack charStack = new CharStack();
        for (char ch : inputString.toCharArray()) {
            charStack.push(ch);
        }
        
        charStack.display();
    }
}

