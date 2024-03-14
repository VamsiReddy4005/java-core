package com.learning.core.day6;

import java.util.Objects;
import java.util.Set;
import java.text.SimpleDateFormat;
import java.util.*;


class Book implements Comparable<Book>
{
	
	private int bookId;
	private String title;
	private double price;
	private String author;
	private Date publicationDate;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(int bookId, String title, double price, String author, Date publicationDate) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.author = author;
		this.publicationDate = publicationDate;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, bookId, price, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && bookId == other.bookId
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title);
	}
	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("%-7d%-25s%-8.1f%-20s%s",
                bookId, title, price, author, dateFormat.format(publicationDate));
		//return "Book [bookId=" + bookId + ", title=" + title + ", price=" + price + ", author=" + author + "]";
	}
	@Override
	public int compareTo(Book other) {
		return Integer.compare(this.bookId, other.bookId);
	}
	
}
public class D06P03 {
	@SuppressWarnings("deprecated")
	public static void main(String[] args) {
		Set<Book> bookSet=new TreeSet<>();
		bookSet.add(new Book(1001, "Python Learning", 715.0, "Martic C. Brown", new Date(120, 1, 2))); 
        bookSet.add(new Book(1002, "Modern Mainframe", 295.0, "Sharad", new Date(97, 4, 19)));
        bookSet.add(new Book(1003, "Java Programming", 523.0, "Gilad Bracha", new Date(84, 10, 23)));
        bookSet.add(new Book(1004, "Read C++", 295.0, "Henry Harvin", new Date(84, 10, 19)));
        bookSet.add(new Book(1005, ".Net Platform", 3497.0, "Mark J. Price", new Date(84, 2, 6)));
        for(Book book:bookSet) {
        	System.out.println(book);
        }
	}
	

}
