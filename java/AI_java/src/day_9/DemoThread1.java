package day_9;

public class DemoThread1 
{
	public static void main(String[] args) {
		// by extending thread
		Thread t1 = new Thread1();
		// by implementing runnable
		Thread t2 = new Thread(new Thread2());
		
		t1.setName("One");
		t2.setName("two");
		t1.start();
		t2.start();
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		for(int i=0;i<10;i++)
		{
			
			if(i==5)
			{
				Thread.yield();
			}
			else
			{
				System.out.println("Main thread: "+i);
			}
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		try {
			t1.join();
			t2.join();
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
