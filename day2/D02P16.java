package com.learning.core.day2;
import java.util.Scanner;

public class D02P16 {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n1=0,n2=1,n3;
		int count=sc.nextInt();
		for(int i=0;i<count;i++)
		{
			System.out.print(n1+" ");
			n3=n2+n1;
			n2=n1;
			n1=n3;
		}
	}
}
