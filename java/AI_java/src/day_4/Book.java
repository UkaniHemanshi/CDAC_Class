package day_4;

public class Book implements Printable,Writable{
	
	private String title;
	private int price;
	public Book(String title, int price)  //constructor of book
	{
		super();
		this.title = title;
		this.price = price;
	}
	
	public void write()
	{
		System.out.println("Writing a book");
	}
	public void print()
	{
		System.out.println("Priting a book");
	}
	public void foo()
	{
//		Printable.super.foo();
		System.out.println("hfjfjhfg");
	}
}
