package com.learning.core.day2;
import java.util.Scanner;

public class D02P12 {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int rows=sc.nextInt();
		for(int i=rows;i>0;i--)
		{
			for(int space=0;space<rows-i;space++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
			
		}
	}
}
