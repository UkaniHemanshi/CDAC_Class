package day_3;

public class Salaried_employee extends Employee
{

	protected double basic;
	
	public Salaried_employee(int empid,String name,double basic)
	{
		super(empid,name);
		this.basic = basic;
	}

	@Override
	public double calaculategross() 
	{
		double hra = basic*0.4;
		double da = basic*0.12;
		return basic +hra +da;
	}
	
	public double calculateNet()
	{
		double gross = this.calaculategross();
		double tax = gross*0.2;
		return gross - tax;
	}
	
//	public static void main(String[] args) {
//		Salaried_employee se = new Salaried_employee(101, "hemanshi", 40000);
//		System.out.println(se.calculateNet());
//	}
}
