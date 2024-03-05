package com.learning.core.day3;
import java.util.Scanner;

public class D03P01 {
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    String input=sc.nextLine();
	    String n=new StringBuffer(input).reverse().toString();
	    if(input.equals(n))
	    {
	    	System.out.println("It is a Palindrome");
	    }
	    else
	    {
	    	System.out.println("It is not a Palindrome");
	    }
	}

	
}

//Insights
//equals() works only for strings.
//reverse() does not work with strings.
//Another method : Convert to array by using toCharArray() and use (h++!=l--) it is Palindrome where h starts from first index and l starts from last index.

