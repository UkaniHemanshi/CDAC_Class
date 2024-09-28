package day_5.list;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoMap 
{
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		
		map.put("one", 100);
		map.put("two", 200);
		map.put("three", 300);
		map.put("four", 400);
		
//		System.out.println(map.get("four"));
		
		Set<String> keyset = map.keySet();
		for(String key : keyset)
		{
			System.out.println(key + "-->" + map.get(key));
		}
		
		System.out.println("**********************************");
		
		Set<Entry<String,Integer>> entries = map.entrySet();
		for(Entry<String,Integer> entry : entries)
		{
			System.out.println(entry.getKey()+ "-->"+entry.getValue());
		}
		
		map.remove("three");
		System.out.println("**********************************");
		keyset = map.keySet();
		for(String key : keyset)
		{
			System.out.println(key + "-->" + map.get(key));
		}
		
	}
}
