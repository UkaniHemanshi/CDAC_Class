package day_3;

import java.util.Arrays;

public class Anagram 
{
	public static boolean check_anagram(String str1,String str2)
	{
		 String l_str1 = str1.toLowerCase();
		 String l_str2 = str2.toLowerCase();
		 if( l_str1.length()!= l_str2.length())
		 {
			 return false;
		 }
		 char[] arr1 = l_str1.toCharArray();
		 char[] arr2 = l_str2.toCharArray();
		 
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);
		 
		 return Arrays.equals(arr1, arr2);
	}
	public static void main(String[] args) {
		
	 String str1 = "bored";
	 String str2 = "robed";
	 
	 if (check_anagram(str1,str2))
	 {
		 System.out.println("The str1 and str2 are Anagram strings");
	 }
	 else
	 {
		 System.out.println("The str1 and str2 are not valid for Anagram");
	 } 
  }
}
