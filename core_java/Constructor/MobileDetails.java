
/*
  Q. Create a class called Mobile with the attributes name, color and price. 
  Create multiple objects of Mobile class
  & initialize through constructor by reading input from user.

  */

import java.util.*;

class Mobile
{
	public String name;
	public String colour;
	public double price;

	Mobile(String name, String colour, double price)
	{
		this.name = name;
		this.colour = colour;
		this.price = price;
	}
}

class MobileDetails 
{
	public static void main(String[] args) 
	{
		System.out.println("FIRST MOBILE DETILS NAME / COLOR / PRICE");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String colour = sc.nextLine();
		double price = sc.nextDouble();
		System.out.println("SECOND MOBILE DETILS NAME / COLOR / PRICE");
		String name2 = sc.next();
		String colour2 = sc.next();
		double price2 = sc.nextDouble();
		System.out.println("THIRD MOBILE DETILS NAME / COLOR / PRICE");
		String name3 = sc.next();
		String colour3 = sc.next();
		double price3 = sc.nextDouble();
		System.out.println("THE INITILIZED DETAILS ARE:");
		Mobile m1 = new Mobile(name,colour,price);
		System.out.println("Name = "+m1.name);
		System.out.println("Colour = "+m1.colour);
		System.out.println("Price = "+m1.price);
		System.out.println("-------------------------");
		Mobile m2 = new Mobile(name2,colour2,price2);
		System.out.println("Name = "+m2.name);
		System.out.println("Colour = "+m2.colour);
		System.out.println("Price = "+m2.price);
		System.out.println("--------------------------");
		Mobile m3 = new Mobile(name3,colour3,price3);
		System.out.println("Name = "+m3.name);
		System.out.println("Colour = "+m3.colour);
		System.out.println("Price = "+m3.price);
	}
}
