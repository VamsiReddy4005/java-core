package com.learning.core.day2;
import java.util.Scanner;

public class D02P02 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=2;i<=a;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		sc.close();
	}

}
