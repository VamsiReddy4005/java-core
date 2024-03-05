package com.learning.core.day3;

import java.util.Scanner;

public class D03P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        String input = scanner.nextLine();
        String[] numsStr = input.split(" ");
        int[] nums = new int[numsStr.length];
        for (int i = 0; i < numsStr.length; i++) {
            nums[i] = Integer.parseInt(numsStr[i]);
        }

        int k = scanner.nextInt();

        // Output
        distinctCombinations(nums, k);
    }

    private static void distinctCombinations(int[] nums, int k) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (k == 2) {
                    System.out.println(nums[i] + " " + nums[j]);
                }
            }
        }
    }
}
