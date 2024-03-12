package com.learning.core.day7;

import java.util.Scanner;

class Node {
    double value;
    Node next;

    public Node(double value) {
        this.value = value;
        this.next = null;
    }
}

class Stack1 {
    Node top;

    public Stack1() {
        this.top = null;
    }

    public void push(double value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public Double pop() {
        if (top != null) {
            double poppedValue = top.value;
            top = top.next;
            return poppedValue;
        } else {
            return null;
        }
    }

    public void display() {
        Node current = top;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class D07P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputValues = scanner.nextLine().split(" ");
        Stack1 stack = new Stack1();

        for (String value : inputValues) {
            stack.push(Double.parseDouble(value));
        }

        System.out.print("The elements of the stack are: ");
        stack.display();

        stack.pop();
        stack.pop();
        System.out.print("After popping twice: ");
        stack.display();
    }
}
