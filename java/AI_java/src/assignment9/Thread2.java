package assignment9;

public class Thread2 implements Runnable 
{
	int num;
	public Thread2(int num) {
		this.num = num;
	}

	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Multiplication table of "+i+" st time "+" = "+num+" * "+ i +" = "+(6*i));
		}
	}
}
