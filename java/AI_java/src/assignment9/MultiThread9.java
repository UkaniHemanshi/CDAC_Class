//9.Create two different threads t1 and t2. Accept a number from the user.
//t1 ==> prints next 10 incremented values of user entered number. 
//t2 ==> prints multiplication table of the same user entered number.

package assignment9;

import java.util.Scanner;

public class MultiThread9 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number on which you want to apply Multi-Threading: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Thread1 t1 = new Thread1(num);
		t1.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("Multiplication table of "+i+" st time "+" = "+num+" * "+ i +" = "+(num*i));
		}
	}
}

