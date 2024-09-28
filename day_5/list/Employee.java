package day_5.list;

import java.util.Set;

public class Employee implements Comparable<Employee>
{
	private int empid;
	private String name;
	private double salary;
	private Set<String> skillset;
	
	public Employee(int empid, String name, double salary, Set<String> skillset) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.skillset = skillset;
	}
	
	public int getEmpid() {
		return empid;
	}
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Set<String> getSkillset() {
		return skillset;
	}
	
	public void setSkillset(Set<String> skillset) {
		this.skillset = skillset;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", skillset=" + skillset + "]";
	}
	public int compareTo(Employee o)
	{
		if(this.empid<o.empid)
		{
			return -1;
		}
		else 
		{
			return 1;
		}
	}

}
