package day_2;

public class Sort_Array
{
	public static void sort_arr(int[] arr)
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
		int arr[]= {10,1,77,3,4,2,16,99};
		Sort_Array sarr = new Sort_Array();
		System.out.println("Before sorting:");
		for (int i: arr)
		{
			System.out.print(i+" ");
		}
		sort_arr(arr);
		System.out.println("\nAfter sorting:");
		for (int i: arr)
		{
			System.out.print(i+" ");
		}
		
	}
}
