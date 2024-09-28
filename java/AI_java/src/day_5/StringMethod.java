package day_5;

public class StringMethod {
	public static String convertTolower(String s) throws EmptyStringException
	{
		if (s == " ")
		{
			throw new EmptyStringException("string is empty");
		}
		else
		{
			return s.toLowerCase();
		}
	}
	
	public static void main(String[] args) {
		String s = "THE JAVA progrMMIng";
//		String s = " ";
		try
		{
			String lower = convertTolower(s);
			System.out.println(lower);
		}
		catch (EmptyStringException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
