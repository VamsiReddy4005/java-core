package com.learning.core.day10;

import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class D10P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileReader fr = null;
        FileWriter fw = null;
        try {
            System.out.println("Enter the source file path:");
            String sourcePath = scanner.nextLine();

            File sourceFile = new File(sourcePath);
            if (!sourceFile.exists()) {
                System.out.println("Source file does not exist.");
                return;
            }

            System.out.println("Enter the destination file path:");
            String destinationPath = scanner.nextLine();
            File destinationFile = new File(destinationPath);

            if (destinationFile.exists()) {
                System.out.println("The destination file already exists. Do you want to overwrite? (yes/no)");
                String answer = scanner.nextLine().toLowerCase();
                if (!answer.equals("yes")) {
                    System.out.println("File not copied.");
                    return;
                }
            } else {
                destinationFile.createNewFile();
            }

            fr = new FileReader(sourceFile);
            fw = new FileWriter(destinationFile);

            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            close(fr);
            close(fw);
            scanner.close();
        }
    }

    public static void close(Closeable stream) {
        try {
            if (stream != null) {
                stream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
