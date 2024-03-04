package com.learning.core.day2;
import java.util.Scanner;

public class D02P15 {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int p=0,n=0,z=0;
		int n1=sc.nextInt();
		int[] arr=new int[n1];
		for(int i=0;i<n1;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n1;i++)
		{
			if(arr[i]>0)
			{
				p++;
			}
			else if(arr[i]<0)
			{
				n++;
			}
			else
			{
				z++;
			}
		}
		System.out.println("No of positive numbers"+p);
		System.out.println("No of negative numbers"+n);
		System.out.println("No of zeroes"+z);
	}
}
