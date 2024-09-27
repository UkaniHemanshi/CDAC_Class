package day_3;

public class Equalstring {

	public static boolean equal_or_equalignore(String str1,String str2)
	{
		if(str1.equals(str2))
		{
			return true;
		}
//		else if (str1.equalsIgnoreCase(str2)) 
//		{
//			return true;`
//		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		String str1 = "HelloWorld";
		String str2 = "helloworld";
		boolean res = equal_or_equalignore(str1,str2);
		System.out.println("Result of after checking string: "+res);
	}
}
