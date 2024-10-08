package day_7;

import java.util.Set;

public class Employee 
{
	private int empid;
	private String name;
	private double salary;
	private Set<String> skillset;
	private String departmart;
	
	
	public Employee(int empid, String name, double salary, Set<String> skillset, String departmart) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.skillset = skillset;
		this.departmart = departmart;
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
	public String getDepartmart() {
		return departmart;
	}
	public void setDepartmart(String departmart) {
		this.departmart = departmart;
	}
	

	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", skillset=" + skillset
				+ ", departmart=" + departmart + "]";
	}
	
	
}
