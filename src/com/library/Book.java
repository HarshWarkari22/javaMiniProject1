package com.library;

public class Book {
	
	int id;
	String bookName;
	String authorName;
	long ISBN;
	int price;
	boolean scienceAndTech;
	
	static int counter;
	Book()
	{
	 
		System.out.println("Default constructor executed \n");
		
	}
	
	static
	{
		System.out.println("------LIBRARY LOADED-----");
	}
	
	
	
	
	{
		counter++;
		id = counter;
		System.out.println("Books created");
	}
	

	
	public int bookId()
	{
		return id;
	}
	
	
	
	
	@Override
	public String toString() {
	    return "Book ID: " + id +
	           "\nBook Name: " + bookName +
	           "\nAuthor Name: " + authorName +
	           "\nISBN: " + ISBN +
	           "\nPrice: " + price +
	           "\nScience & Tech: " + scienceAndTech;
	}


}
