package day_1;

import java.util.Scanner;

public class Student
{

	private String name;
	static int roll_num;
	
	public Student(String name)
	{
		this.name = name;
	}
	
	
	public String toString()
	{
		roll_num +=1;
		return "Name of student is: "+name+" and roll_number is: "+roll_num;
		
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		Student sd= new Student(name);
		System.out.println(sd);

	}

}
