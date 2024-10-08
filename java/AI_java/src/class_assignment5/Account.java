package class_assignment5;

public class Account 
{
	private double balance;
	boolean hassufficient = false;

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	public synchronized void withdraw(int  amount)
	{
		
		while(!hassufficient) {
			try {
				wait();
				System.out.println("Waiting for deposite !! ");
			}catch (InterruptedException e) {
                e.printStackTrace();
			}
		}
		hassufficient = false;
		notify();
		if(balance>amount)
		{
			System.out.println("Withdraw method is now working ");
			System.out.println("Balance = "+ balance);
			balance = balance - amount;
			System.out.println("Withdraw is succesfully!!");
			System.out.println("After withdraw your balance: "+ balance+"\n");
		}
		
	} 
	
	public synchronized void deposite(int amount)
	{
		balance = balance + amount;
		System.out.println("Your balance after deposite :"+ balance+"");
		hassufficient = true;
		notify();
	}
}
