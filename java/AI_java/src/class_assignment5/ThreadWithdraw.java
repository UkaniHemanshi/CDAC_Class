package class_assignment5;
public class ThreadWithdraw extends Thread
{
	private Account acc; // Shared Account instance

    public ThreadWithdraw(Account ac) {
        this.acc = ac; // Accepting a shared Account instance
    }
	
	public void run()
	{
		for (int i=0; i<3; i++){
            acc.withdraw(9000);
            try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
                e.printStackTrace();
			}
        }
	}
}