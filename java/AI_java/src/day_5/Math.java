package day_5;

public class Math 
{
	public static void main(String[] args) 
	{
		try
		{
			int divided = Integer.parseInt(args[0]);
			int divisor = Integer.parseInt(args[1]);
			
			int res = divided/divisor;
			System.out.println(res);
		}
		catch (ArithmeticException e)  // custom exception message
		{
			System.out.println("The divisor can not be zero");
			e.printStackTrace();
		}
		catch (NumberFormatException e) 
		{
			System.out.println("Enter Integer only");
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Enter two values as divided and divisor");
			System.out.println(e.getMessage());
		}
		
	}
}
	
