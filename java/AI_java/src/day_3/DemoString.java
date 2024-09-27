package day_3;

public class DemoString
{

	public static void main(String[] args)
	{
		String s = "Java";
		String s1 = "Java";
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		//		s = s+ "11";
		//		System.out.println(s.hashCode());

		if(s==s1)
		{
			System.out.println("Strings are equal");
		}
		
		String n1 = new String("hello");
		String n2 = new String("hello");
		System.out.println(n1.hashCode());
		System.out.println(n2.hashCode());
		
		//false because they are referring to different objects
		
		if(n1==n2)
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
		
		
		if(n1.equals(n2))
		{
			System.out.println("Strings are equal");
		}
		
//In Java, both the + operator and the concat() method can be used to concatenate strings,
//regardless of whether the strings were created using the new keyword or not.
		System.out.println(n1+n2);
		System.out.println(n1.concat("world"));
		n1=n1.concat(n2);
		System.out.println(n1);
		n1 = n1+"world";
		System.out.println(n1);
		
	}

}
