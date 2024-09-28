package day_5.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList 
{
	public static void main(String[] args)
	{
		List lst = new ArrayList<>();
		lst.add(10);
		lst.add("hello");
		lst.add("hemanshi");
		lst.add(23.5f);
		lst.add(true);
		
		System.out.println("\nGet all element using for:");
		for (int i = 0;i<lst.size();i++)
		{
			System.out.println(lst.get(i));
		}
		
		lst.remove("hello");
		
		System.out.println("\nGet all element using object:");
		for(Object o :lst)
		{
			System.out.println(o);
		}
		
		System.out.println("\nGet all element using iterator:");
		Iterator it = lst.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for(Object o:lst)
		{
			int i = (Integer)o;
			System.out.println(i++);
		}
	}
}
