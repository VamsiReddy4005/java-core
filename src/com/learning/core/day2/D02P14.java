package com.learning.core.day2;
import java.util.Scanner;

public class D02P14 {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int n=sc.nextInt();
		int pow=1;
		for(int i=n;i>0;i--)
		{
			pow=pow*a;
		}
		System.out.println(pow);
		sc.close();
	}
}