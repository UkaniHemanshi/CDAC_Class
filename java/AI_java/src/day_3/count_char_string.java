package day_3;

public class count_char_string 
{
	public void count_chr(String str)
	{
		int upperchr = 0;
		int lowerchr = 0;
		int specialchr = 0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				upperchr += 1;
			}
			else if(Character.isLowerCase(ch))
			{
				lowerchr += 1;
			}
			else if(!Character.isDigit(ch) && !Character.isLetter(ch))
			{
				specialchr += 1;
			}
		}
		System.out.println("Uppercase in given string: "+ upperchr);
		System.out.println("Lowercase in given string: "+ lowerchr);
		System.out.println("Specialcase in given string:"+ specialchr);
		
	}
	
	public static void main(String[] args)
	{
		String str = "helloWorld!@";
		count_char_string c1=new count_char_string();
		c1.count_chr(str);
	} 
}
