package com.learning.core.day1;

public class D01P01 {
	public static void createBooks(Book book,String title, double price)
	{
		book.setPrice(price);
		book.setTitle(title);
	}
	public static void showBooks(Book book)
	{
		System.out.println("Book Title :"+ book.getTitle()+" and Price:"+book.getPrice());
	}
	public static void main(String[] args)
	{
		
		com.learning.core.day1.Book myBook= new com.learning.core.day1.Book();
		
		createBooks(myBook,"Java Programming",350.00);
		showBooks(myBook);
	}


}



