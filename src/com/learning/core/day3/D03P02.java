package com.learning.core.day3;
import java.util.Scanner;

public class D03P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input set 1
        int num1Set1 = scanner.nextInt();
        int num2Set1 = scanner.nextInt();
        int[] arraySet1 = {7, 25, 5, 19, 30};
        checkAndPrintBingo(num1Set1, num2Set1, arraySet1);

        // Input set 2
        int num1Set2 = scanner.nextInt();
        int num2Set2 = scanner.nextInt();
        int[] arraySet2 = {8, 17};
        checkAndPrintBingo(num1Set2, num2Set2, arraySet2);

        // Input set 3
        int num1Set3 = scanner.nextInt();
        int num2Set3 = scanner.nextInt();
        int[] arraySet3 = {9, 17, 3, 39, 8};
        checkAndPrintBingo(num1Set3, num2Set3, arraySet3);
    }

    private static void checkAndPrintBingo(int num1, int num2, int[] array) {
        if (isInArray(num1, array) && isInArray(num2, array)) {
            System.out.println("Bingo");
        } else {
            System.out.println("Not Found");
        }
    }

    private static boolean isInArray(int num, int[] array) {
        for (int i : array) {
            if (num == i) {
                return true;
            }
        }
        return false;
    }
}
