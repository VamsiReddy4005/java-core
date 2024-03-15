package com.learning.core.day10;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class D10P05 {
    public static void main(String[] args) {
        try {
            String inputString = "Hello, world!";
            Files.write(Paths.get("io.txt"), inputString.getBytes());

            long fileSize = Files.size(Paths.get("io.txt"));
            System.out.println("Size of the file: " + fileSize + " bytes");

            String fileContent = Files.readString(Paths.get("io.txt"));
            System.out.println("Contents of the file:");
            System.out.println(fileContent);

            Files.deleteIfExists(Paths.get("io.txt"));
            System.out.println("File deleted successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}

