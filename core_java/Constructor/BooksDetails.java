
/*
  Q. Create a class called Book with the attributes name , author, price and publisher, 
  Create multiple objects of Book class
  & initialize through constructor by reading input from user.

  */

import java.util.*;
class Book 
 {
	public String name;
	public String author;
	public double price;
	public String publisher;

	Book(String name , String author, Double price, String publisher){
		this.name = name;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
}
class BooksDetails
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("FIRST BOOK DETILS NAME / AUTHOR / PUBLISHER / PRICE");
		String name = sc.next();
		String author = sc.next();
		String publisher = sc.next();
		double price = sc.nextDouble();
		System.out.println("SECOND BOOK DETILS NAME / AUTHOR / PUBLISHER / PRICE");
		String name1 = sc.next();
		String author1 = sc.next();
		String publisher1 = sc.next();
		double price1 = sc.nextDouble();
		System.out.println("THE INITILIZED DETAILS ARE:");
		Book b1 = new Book(name,author,price,publisher);
		System.out.println("Name = "+b1.name);
		System.out.println("Author = "+b1.author);
		System.out.println("Price = "+b1.price);
		System.out.println("Publisher = "+b1.publisher);
		System.out.println("-------------------------");
		Book b2 = new Book(name1,author1,price1,publisher1);
		System.out.println("Name = "+b2.name);
		System.out.println("Author = "+b2.author);
		System.out.println("Price = "+b2.price);
		System.out.println("Publisher = "+b2.publisher);
		System.out.println("-------------------------");
	}
}
