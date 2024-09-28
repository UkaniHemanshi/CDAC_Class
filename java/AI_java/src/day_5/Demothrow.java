package day_5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Demothrow 
{
	public static void checkfile(String path) throws IOException
	{
		File f = new File("data.txt");
		if(!f.exists())
		{
			throw new IOException("File is not present");
		}
	}
	
	public static void checknumber(int num) throws Exception
	{
		if (num>1000)
		{
			throw new Exception("Number is to long");
		}
	}
	
	
	public static void main(String[] args) 
	{
//**************************without creating function or method for checking****************	
//		try
//		{
//			File f = new File("data.txt");
//			if(!f.exists())
//			{
//				throw new IOException("File is not present");
//			}
//		}
//		catch (IOException e)
//		{
//			System.out.println(e.getMessage());
//		}
	
		
//****************************by using function to throws Exception******************

//		try
//		{
//			checkfile("abc.txt");
//		}
//		catch (IOException e)
//		{
//			e.printStackTrace();
//		}

//***************************for number checking exception handling********************
		
		try
		{
			System.out.println("Enter the number you check: ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			checknumber(num);
		}
		catch(Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}
		
	}
}
