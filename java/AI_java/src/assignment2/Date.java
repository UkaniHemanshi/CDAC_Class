package assignment2;

import java.util.Scanner;

public class Date 
{
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) 
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String toString()
	{
		return day+ "/" +month+ "/" +year;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the month: "); 
		Scanner sc = new Scanner(System.in);
		String month = sc.next();
		MonthEnum monthValue = MonthEnum.valueOf(month.toUpperCase());
		
		Date d = new Date(29,monthValue.get_m_value(),2002);
		System.out.println("Date: " + d);
	}
}
