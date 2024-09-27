package day_3;

public class Contract_employee extends Employee
{
	
	protected double hrs; 
	protected double rem; 
	
	public Contract_employee(int empid, String name,double hrs,double rem)
	{
		super(empid, name);
		this.hrs = hrs;
		this.rem = rem;
	}

	@Override
	public double calaculategross()
	{
		return hrs * rem;
	}
}
