package day_5;

public class Mathnew 
{
	public static void divide(String s1,String s2) throws ArithmeticException,
	NumberFormatException,ArrayIndexOutOfBoundsException,NullPointerException
	{
		int divided = Integer.parseInt(s1);
		int divisor = Integer.parseInt(s2);
		
		int res = divided/divisor;
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		try
		{
			divide(args[0],args[1]);
		}
		// multi-catch block 
		catch(ArithmeticException|NumberFormatException|ArrayIndexOutOfBoundsException|NullPointerException e)
		{
			System.out.println(e);
		}
	}
}
