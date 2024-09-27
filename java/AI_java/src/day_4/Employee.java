package day_4;

public abstract class Employee implements Printable
{
	protected int empid;
	protected String name;
	
	public Employee(int empid, String name)
	{
		this.empid = empid;
		this.name = name;
	}
	
	public abstract double calaculategross();
	
	public void print()
	{
		System.out.println("Employee Data: Emp_id: "+empid+" , name: "+name);
	}
}
