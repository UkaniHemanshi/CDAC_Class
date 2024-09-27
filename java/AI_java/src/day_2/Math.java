package day_2;

import day_1.Date;


public class Math
{
	public static int increment(int num)
	{
		num=num+1;
		return num;
	}
	
	public static void increment_date(Newdate d)
	{
		int day = d.getday();
		d.setday(day+1);
	}
	public static void swapdate(Date d1,Date d2)
	{
		Date temp = d1;
		d1 = d2;
		d2 = temp;
	}
	public static void bubble_sort(int[] arr)
	{
		
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(arr[j]> arr[i])
				{ 
					int temp = arr[j];
					arr[j]= arr[i];
					arr[i] = temp;
				}
			}
		}
			
	}
	public static void main(String[] args)
	{
//		increment number
		int n=10;
		System.out.println("Before Increment:"+n);
		
//		increment date by 1
		Newdate d = new Newdate();
		d.setday(29);
		d.setmonth("AUG");
		d.setyear(2002);
		System.out.println("Before increment date by 1:\n"+d);
		increment_date(d);
		System.out.println("After increment date by 1:\n"+d);
		
//		swap the date from date class
		Date d1 = new Date();
		Date d2 = new Date();
		d1.setDate(29, "Aug", 2002);
		d2.setDate(30, "Oct", 2001);
		System.out.println("\nBefore Swap d1 and d2:\n"+d1+" and "+d2);
		swapdate(d1,d2);
		System.out.println("After Swap d1 and d2:\n"+d1+" and "+d2);
		
		
		
//		for sort
		int arr[]= {10,1,77,3,4,2,16,99};
		Math sarr = new Math();
		System.out.println("Before sorting:");
		for (int i: arr)
		{
			System.out.print(i+" ");
		}

//		bubble_sort method calling for sort the array
		bubble_sort(arr);  
		System.out.println("\nAfter sorting:");
		for (int i: arr)
		{
			System.out.print(i+" ");
		}
		
		
//		
	}
	

}
