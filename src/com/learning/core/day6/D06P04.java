package com.learning.core.day6;

import java.text.SimpleDateFormat;
import java.util.*;

class Book1 implements Comparable<Book1> {
    private int bookId;
    private String title;
    private double price;
    private String author;
    private Date publicationDate;
    
    
    public Book1() {
		super();
		// TODO Auto-generated constructor stub
	}

    public Book1(int bookId, String title, double price, String author, Date publicationDate) {
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
        return Objects.hash(bookId, title, price, author, publicationDate);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book1 book = (Book1) obj;
        return bookId == book.bookId && Double.compare(book.price, price) == 0 &&
                Objects.equals(title, book.title) && Objects.equals(author, book.author) &&
                Objects.equals(publicationDate, book.publicationDate);
    }
    
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        return String.format("%-7d%-25s%-8.1f%-20s%s",
                bookId, title, price, author, dateFormat.format(publicationDate));
    }

    @Override
    public int compareTo(Book1 other) {
        return this.author.compareTo(other.author);
    }
}

public class D06P04{
	@SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Set<Book1> bookSet = new TreeSet<>();
        bookSet.add(new Book1(1001, "Python Learning", 715.0, "Martic C. Brown", new Date(120, 1, 2))); 
        bookSet.add(new Book1(1002, "Modern Mainframe", 295.0, "Sharad", new Date(97, 4, 19)));
        bookSet.add(new Book1(1003, "Java Programming", 523.0, "Gilad Bracha", new Date(84, 10, 23)));
        bookSet.add(new Book1(1004, "Read C++", 295.0, "Henry Harvin", new Date(84, 10, 19)));
        bookSet.add(new Book1(1005, ".Net Platform", 3497.0, "Mark J. Price", new Date(84, 2, 6)));

        System.out.println("Output:");
        for (Book1 book : bookSet) {
            System.out.println(book);
        }
    }
}

