package Day_2;

import Day_1.Date;

public class DemoArray
{
	public static void main(String[] args)
	{
		int arr[] = {12,13,14,15,16};
		for(int i:arr)
		{
			if(i%2==0)
				System.out.println("Number is even");
			else
				System.out.println("Number is odd");
		}
//everytime you create a new object use new keyword other wise nullpointerexception

		Date dd[] = new Date[3];
		dd[0] = new Date();
		dd[0].setDate(12,"aug",2000);
		dd[1] = new Date();
		dd[1].setDate(10,"aug",2000);
		dd[2] = new Date();
		dd[2].setDate(11,"aug",2000);
		
		dd[0].displaydate();
		dd[1].displaydate();
		dd[2].displaydate();
		
//by foreach loop
		for(Date d:dd)
		{
			d.displaydate();
		}

	}
	

}
