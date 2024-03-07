package com.learning.core.day2;
import java.util.Scanner;

public class D02P11 {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i); //Dont use println here. So it wont print in other line
			}
			System.out.println(); //To print in next line use ln here
		}
	}

}
