package com.learning.core.day3;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class D03P14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the first array:");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter the elements of the first sorted array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Enter the size of the second array:");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter the elements of the second sorted array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }

        findUnionAndIntersection(arr1, arr2);
    }

    private static void findUnionAndIntersection(int[] arr1, int[] arr2) {
        Set<Integer> unionSet = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                unionSet.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                unionSet.add(arr2[j]);
                j++;
            } else {
                unionSet.add(arr1[i]);
                intersectionSet.add(arr1[i]);
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            unionSet.add(arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            unionSet.add(arr2[j]);
            j++;
        }

        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectionSet);
    }
}
