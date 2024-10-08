package assignment1;

// 1. Loop/conditions : write program for checking prime number, calculating factorial
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
	
	public static int fact(int num)
	{
		 int fact = 1;
		 for(int i=1;i<=num;i++)
		 {
			 fact *= i;
		 }
		 return fact;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// For isprime number
		boolean flag = isprime(num);
		if(flag)
		{
			System.out.println("Number is a prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
		
		// For factorial 
		
		System.out.println("Factorial of "+num+" is: "+fact(num));
	}
}
