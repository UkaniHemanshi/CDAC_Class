package day_3;

public class PayrollApp
{
	public void displaygross(Employee e)
	{
		System.out.println("Gross Salary: "+e.calaculategross());
	}
	
	public void displayNet(Salaried_employee e)
	{
		System.out.println("Net Salary: "+ e.calculateNet());
	}
}
