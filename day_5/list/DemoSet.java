package day_5.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoSet 
{
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(12);
		set.add(12);
		set.add(13);
		set.add(15);
		set.add(13);
		set.add(14);
		set.add(16);
		
		for (Integer i : set)
		{
			System.out.println(i);
		}
		
		System.out.println("**********After_removing_16******");
		set.remove(16);
		for (Integer i : set)
		{
			System.out.println(i);
		}
		System.out.println(set.contains(13));
		
	}
}
