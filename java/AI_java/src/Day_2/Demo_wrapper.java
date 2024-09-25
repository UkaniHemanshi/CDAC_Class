package Day_2;

public class Demo_wrapper {
	public static void main(String[] args) {
		int i = 5;
		Integer j = Integer.valueOf(i); // primitive to wrapper
		System.out.println();
		
		int k = j.intValue();  // wrapper to primitive
		
		// auto.boxing
		int a = 12;
		Integer b = a;
		
		// auto unboxing
		int c = b;
		
		//parsing 
		int x = Integer.parseInt("30");
		Integer y = Integer.valueOf("40");
		System.out.println(j);
		System.out.println(k);
	}
}
