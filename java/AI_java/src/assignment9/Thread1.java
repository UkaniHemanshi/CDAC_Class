package assignment9;

import static java.lang.Thread.currentThread;

public class Thread1 extends Thread  
{
	int num;
	public Thread1(int num) {
		this.num = num;
	}

	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Number is increment by "+i+" time "+(5+i));
		}
	}
}
