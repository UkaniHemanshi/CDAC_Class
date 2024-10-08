package class_assignment5;

public class AccountMainThread 
{
	public static void main(String[] args) {
		Account ac = new Account(10000); // Shared account instance
		ThreadDeposite t1 = new ThreadDeposite(ac);
		ThreadWithdraw t2 = new ThreadWithdraw(ac);
		
		t1.start();
		t2.start();
	}
}
