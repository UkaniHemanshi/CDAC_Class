package day_3;

public class Manager extends Salaried_employee
{
	protected double allowance;
	public Manager(int empid, String name, double basic,double allowance) 
	{
		super(empid, name, basic);
		this.allowance = allowance;
	}
	
	public double calaculategross()
	{
		return super.calaculategross() + allowance;
	}
	public void displayallowance()
	{
		System.out.println("Allowance: "+allowance);
	}
}
