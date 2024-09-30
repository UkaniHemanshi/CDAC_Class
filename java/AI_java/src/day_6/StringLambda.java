package day_6;

public class StringLambda 
{
	public static String operatorOnString(StringFunction f,String s)
	{
		return f.operation(s);
	}
	
	public String reverse(String s)
	{
		   String str = " ";
		   for(int i=s.length()-1; i>=0; i--)
		   {
			   str += s.charAt(i);
		   }
		   return str;
	}
	
	public static void main(String[] args) 
	{
		// convert string to upper case
		String convertUpper = operatorOnString((s) -> s.toUpperCase() , "hello, welcome to JavaProgram");
		System.out.println(convertUpper);
				
		// convert string to reverse
		String convertReverse = operatorOnString((s) ->
		{
		   String str = " ";
		   for(int i=s.length()-1; i>=0; i--)
		   {
			   str += s.charAt(i);
		   }
		   return str;
		}, "welcome");
		System.out.println(convertReverse);
		
		String upper = operatorOnString(String::toUpperCase,"hello");
		System.out.println(upper);
		
		StringLambda s1 = new StringLambda();
		String reverse = operatorOnString(s1::reverse,"hello");
		System.out.println(reverse);
	}
}
