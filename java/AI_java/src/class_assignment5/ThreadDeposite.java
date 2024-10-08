package class_assignment5;

public class ThreadDeposite extends Thread
{
    private Account acc;

    public ThreadDeposite(Account ac) {
    	  this.acc = ac; // Accepting a shared Account instance
	}
    
	public void run()
	{
		for (int i=0; i<4; i++){
            acc.deposite(2000);
            try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
                e.printStackTrace();
			}
        }
	}
}
