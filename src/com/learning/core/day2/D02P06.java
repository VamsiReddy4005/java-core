package com.learning.core.day2;
import java.util.Scanner;

public class D02P06 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=3;
		while(t-->0)
		{
			int week=sc.nextInt();
			String[] weekname= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
			if(week>=1 && week<=7)
			{
				System.out.println(weekname[week-1]);
			}
			else
				System.out.println("Invalid Input");
				
		}
		sc.close();
	}

}
