package com.learning.core.day2;
import java.util.Scanner;

public class D02P07 {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		if(a>=60)
			System.out.println("Grade A");
		else if(a>=45 && a<60)
			System.out.println("Grade B");
		else if(a>=35 && a<45)
			System.out.println("Grade C");
		else
			System.out.println("Fail");
	}
	

}
