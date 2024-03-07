package com.learning.core.day2;
import java.util.Scanner;

public class D02P01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=3;
        while(t-->0)
        {

          int monthNumber = sc.nextInt();

          if (monthNumber >= 1 && monthNumber <= 12) {
            String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            String monthName = months[monthNumber - 1];
            System.out.println(monthName);
        } 
            else {
                System.out.println("Invalid Input");
            }
        }
    }
}
