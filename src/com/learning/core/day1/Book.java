package com.learning.core.day1;

public class Book {
	private double book_price;
	private String book_title;
	public void setPrice(double book_price)
	{
		this.book_price=book_price;
	}
	public void setTitle(String book_title)
	{
		this.book_title=book_title;
	}
	public double getPrice()
	{
		return book_price;
	}
	public String getTitle()
	{
		return book_title;
	}
	
}
