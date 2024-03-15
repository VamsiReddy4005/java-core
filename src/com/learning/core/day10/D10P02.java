package com.learning.core.day10;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    int rollNo;
    String name;
    int age;
    String address;

    public Student(int rollNo, String name, int age, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

public class D10P02 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Enter Roll Number: ");
                int rollNo = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter Name: ");
                String name = scanner.nextLine().trim();

                System.out.print("Enter Age: ");
                int age = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter Address: ");
                String address = scanner.nextLine().trim();

                if (rollNo <= 0 || name.isEmpty() || age <= 0 || address.isEmpty()) {
                    System.out.println("None of the fields should be blank. Please try again.");
                    continue;
                }

                Student student = new Student(rollNo, name, age, address);

                System.out.print("Do you want to write the data in the file? (Yes/No): ");
                String choice = scanner.nextLine().toLowerCase();
                if (choice.equals("yes")) {
                    FileOutputStream fileOut = new FileOutputStream("students.ser", true);
                    ObjectOutputStream out = new ObjectOutputStream(fileOut);
                    out.writeObject(student);
                    out.close();
                    fileOut.close();
                    System.out.println("Data saved into file as an object.");
                } else {
                    System.out.println("Program terminated.");
                    break;
                }
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

