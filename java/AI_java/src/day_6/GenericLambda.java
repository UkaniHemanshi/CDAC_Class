package day_6;

public class GenericLambda 
{
	public static <T> T operateOndata(GenericFunction<T> f,T data)
	{
		return f.apply(data);
	}
	
	public static void main(String[] args) {
		
		String substring = operateOndata((s) -> s.substring(3), "HelloWorld!!!@");
		System.out.println(substring);
		
		Integer square = operateOndata((n) -> n*n, 24);
		System.out.println(square);
		
		Date today = new Date(29,"Aug",2002);
		Date tommorow = operateOndata((d) -> new Date(d.getDay()+1 , d.getMonth() , d.getYear()),today);
		System.out.println(tommorow);
	}
}
