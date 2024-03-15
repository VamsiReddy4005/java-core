package com.learning.core.day10;

import java.io.*;

public class D10P06 {
    public static void main(String[] args) {
        String[] fileNames = {"DavidEnglish.txt", "DavidScience.txt", "DavidComputer.txt"};
        String outputFileName = "DavidNotes.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            for (String fileName : fileNames) {
                writer.write("*" + fileName + "\n");
                try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        writer.write(line + "\n");
                    }
                    writer.write("\n");
                } catch (IOException e) {
                    System.out.println("Error reading file: " + e.getMessage());
                }
            }
            System.out.println("DavidNotes.txt created successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
