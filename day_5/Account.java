package day_5;

import java.util.Scanner;

public class Account
{
	static int balance = 10000;
	static Scanner sc = new Scanner(System.in);
	
	public static void Deposit() throws IncorrectDenominationException
	{
		System.out.println("Enter the amount for deposite: ");
		int deposit_amt = sc.nextInt();
		if(deposit_amt % 10 != 0)
		{
			throw new IncorrectDenominationException("Your deposite amount is not multiple of 10");
		}
		else
		{
			balance += deposit_amt;
			System.out.println("Deposit successfully !!");
			System.out.println("Your current balance is: "+ balance);
		}
	}
	
	public static void Withdraw() throws InsuffcientFundException, TransactionLimitExceededException
	{
		System.out.println("Enter the amount do you want withdraw: ");
		int withdraw_amt = sc.nextInt();
		if(withdraw_amt >= balance)
		{
			throw new InsuffcientFundException("InsuffcientFund in your Account !!");
		}
		else if (withdraw_amt>5000)
		{
			throw new TransactionLimitExceededException("Transaction limit exceeded !!");
		}
		else
		{
			balance -= withdraw_amt;
			System.out.println("Your current balance is: "+ balance);
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter the choice for Deposite | Withdraw money\nPress D or W: ");
		String opt = sc.next();
		if (opt.equalsIgnoreCase("D"))
		{
			try
			{
				Deposit();
			}
			catch (IncorrectDenominationException e)
			{
				System.out.println(e.getMessage());
			}	
		}
		else if (opt.equalsIgnoreCase("W"))
		{
			try
			{
				Withdraw();
			}
			catch(InsuffcientFundException e)
			{
				System.out.println(e.getMessage());
			}
			catch(TransactionLimitExceededException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}
