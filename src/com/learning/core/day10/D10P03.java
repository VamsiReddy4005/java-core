package com.learning.core.day10;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class D10P03 {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("students.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            List<Student> students = new ArrayList<>();
            try {
                while (true) {
                    Student student = (Student) in.readObject();
                    students.add(student);
                }
            } catch (Exception e) {
                // End of file reached
            }

            in.close();
            fileIn.close();

            System.out.println("Records saved in the file:");
            for (Student student : students) {
                System.out.println("Roll Number: " + student.rollNo);
                System.out.println("Name: " + student.name);
                System.out.println("Age: " + student.age);
                System.out.println("Address: " + student.address);
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
