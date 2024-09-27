package assignment1;

import java.util.Scanner;

public class Primecheck 
{
	public static boolean isprime(int num)
	{
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean flag = isprime(num);
		if(flag)
		{
			System.out.println("Number is a prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
	}
}
