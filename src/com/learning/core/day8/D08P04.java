package com.learning.core.day8;
import java.util.Scanner;

class Queue4 {
    String[] queue;
    int front;
    int rear;
    int maxSize;

    public Queue4(int size) {
        maxSize = size;
        queue = new String[maxSize];
        front = 0;
        rear = -1;
    }

    public void enqueue(String item) {
        if (rear == maxSize - 1) {
            System.out.println("Queue is full");
        } else {
            queue[++rear] = item;
        }
    }

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        } else {
            String item = queue[front++];
            if (front == maxSize) {
                front = 0;
                rear = -1;
            }
            return item;
        }
    }

    public boolean isEmpty() {
        return (rear == -1 || front == rear + 1);
    }
}

public class D08P04 {
    public static void main(String[] args) {
        Queue4 queue = new Queue4(7); 

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine().trim(); 
            if (input.isEmpty() || input.equals("[]")) {
                break; 
            }
            queue.enqueue(input);
            if (queue.isEmpty()) {
                System.out.println("Empty");
            } else {
                System.out.println("Not Empty");
            }
            if (queue.rear == 6) { 
                break;
            }
        }

        if (queue.isEmpty()) {
            System.out.println("Empty");
        }

        scanner.close();
    }
}
