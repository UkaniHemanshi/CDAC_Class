package day_3;

public class Shift_String {
	
	public static void shift_left(String str)
	{
		int shift = 4;
		
		int len = str.length();
        shift = shift % len; 
        
		String shiftedString = str.substring(shift) + str.substring(0, shift);
	    System.out.println("Original String: " + str);
	    System.out.println("Shifted String: " + shiftedString);
	}
	public static void main(String[] args) {
		String str = "Javaprogram";
		shift_left(str);
	}
}
