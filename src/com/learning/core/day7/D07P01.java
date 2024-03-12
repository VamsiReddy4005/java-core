package com.learning.core.day7;

import java.util.Scanner;

class Stack
{
	private int size;
	String arr[];
	int top;
	public Stack(int size) {
		super();
		this.size = size;
		this.arr=new String[size];
		this.top=-1;
	}
	public void push(String str)
	{
		if(top>=size)
		{
			System.out.println("Stack Overflow");
		}
		else
		{
			arr[++top]=str;
		}
	} 
	public String pop()
	{
		if(top<0)
		{
			System.out.println("Stack Underflow");
			return "-1";
		}
		else
		{
			String x=arr[top--];
			return x;
		}
	}
	public void print()
	{
		for(int i=top;i>-1;i--)
		{
			System.out.println(arr[i]);
		}
	}
	
}
public class D07P01 {
	public static void main(String[] args)
	{
		Stack s=new Stack(4);
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			String str=sc.next();
			s.push(str);
		}
		s.pop();
		s.print();
		
	}

}
