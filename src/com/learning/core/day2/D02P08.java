package com.learning.core.day2;
import java.util.Scanner;

public class D02P08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=0;
		for(int i=a;i<=b;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);

	}

}
