package day_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoLambda1 
{
	public boolean operatorOnNum(Predicate p,int n)
	{
		return p.test(n);
	}
	
	public List<Integer> operatorOnNum(Predicate p,List<Integer> n)
	{
		List<Integer> filtered = new ArrayList<>();
		for(Integer i : n)
		{
			if(p.test(i))
			{
				filtered.add(i);
			}
		}
		return filtered;
	}
	
	
	
	public static void main(String[] args) 
	{
		DemoLambda1 demo = new DemoLambda1();
		
		// give positive number
		boolean ispositive = demo.operatorOnNum((n) -> n>0, 12);
		System.out.println(ispositive);
		
		// give positive number list
		Integer [] nums = {12,-13,-12,-18,19,200,-100,400};
		List<Integer> vals = Arrays.asList(nums);
		List<Integer> positives = demo.operatorOnNum((n) -> n>0, vals);
		System.out.println(positives);
		
		// multiple of 100
		List<Integer> multipleOf = demo.operatorOnNum((n) -> n%100 == 0 & n>0, vals);
		System.out.println(multipleOf);
		
	}
}
