package day_6;

public class DemoAnonymus 
{
   public static void main(String[] args) 
   {
	   Predicate iseven = (n) -> n%2 == 0;
	   System.out.println(iseven.test(12));
	   
	   Predicate isprime = (n) -> 
	   {
		   for(int i=2;i<n;i++)
		   {
			   if(n%i == 0)
			   {
				   return false;
			   }
		   }
		   return true;
	   };
	   System.out.println(isprime.test(4));
   }
}
