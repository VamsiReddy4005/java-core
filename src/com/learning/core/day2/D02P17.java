package com.learning.core.day2;
import java.util.Scanner;

public class D02P17 {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			int flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;    //flag is used instead of count
				}
			}
			if(flag==0)
			{
				System.out.println(i);
			}
			
		}
	}
}
