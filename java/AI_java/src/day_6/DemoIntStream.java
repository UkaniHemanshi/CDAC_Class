package day_6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DemoIntStream 
{
  public static void main(String[] args) 
  {
	int [] num = {12,4,5,6,7,8,22,13,45,34,22,8,9,12,77,89};
	IntStream stream = Arrays.stream(num);
	
	System.out.println(stream.count());
	
	stream = Arrays.stream(num);
	System.out.println(stream.distinct().sorted().count());
	
	stream = Arrays.stream(num);
	stream.distinct().sorted().forEach(System.out::println);
	
	stream = Arrays.stream(num);
	List<Integer> num1 =stream.map((n) -> n*2).boxed().collect(Collectors.toList());
	System.out.println(num1);
  }
}
