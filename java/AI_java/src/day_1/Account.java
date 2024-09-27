package day_1;

public class Account
{
	private int accid;
	private String name;
	private static double intrate;
	
	static
	{
		System.out.println("static block1");
		intrate = 6.5f;
	}
	static
	{
		System.out.println("static block2");
	}
	

	// default constructor
	public Account()
	{
	// Below we are initializing default constructor
	//      accid =10000;
	//		name = "jdsnv";
			
	//	another way of initializing
	//		Below we are calling Parameterized constructor in default constructor
		this(10000,"vvhh");
		System.out.println("default constructor "+accid+" "+name);
	}
	
	//	Parameterized constructor
	public Account(int accid, String name)
	{
		this.accid = accid;
		this.name = name;
		System.out.println("Parameterized constructor "+accid+" "+name);
	}
	
	public static void displayInterestRate()
	{
		System.out.println("Current interest rate is: "+intrate);
	}
	
	public static void main(String[] args)
	{
		Account acc = new Account();

		Account acc1 = new Account(127457347,"sachin");
	
		Account.displayInterestRate();
	}

}
