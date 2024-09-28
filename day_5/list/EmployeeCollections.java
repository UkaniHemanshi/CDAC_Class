package day_5.list;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class EmployeeCollections 
{
	public List<Employee> initalizeEmployeData()
	{
		List<Employee> emplist = new ArrayList<>();
		Set<String> skills1 = new TreeSet<>();
		skills1.add("Java");
		skills1.add("C++");
		
		emplist.add(new Employee(56,"aaa",23000,skills1));
		
		Set<String> skills2 = new TreeSet<>();
		skills2.add("Java");
		skills2.add("Python");
		
		emplist.add(new Employee(56,"bbb",22000,skills2));
		
		Set<String> skills3 = new TreeSet<>();
		skills3.add("ML");
		skills3.add("NLP");
		
		emplist.add(new Employee(90,"ccc",25000,skills3));
		return emplist;
		 
	}
	
	public void printlist(List<Employee> emplist)
	{
		for(Employee emp :emplist)
		{
			System.out.println(emp);
		}
	}
	
	public Employee searchEmployee(List<Employee> emplist,int empid)
	{
		for(Employee emp :emplist)
		{
			if (emp.getEmpid() == empid)
			{
				System.out.println("Result of search by id: "+emp);
			}
		}
		System.out.println("Result of search by id: "+ null);
		return null;
	}
	
	public List<Employee> filterEmployees(List<Employee> emplist,String criteria) 
	{
		List<Employee> filtered = new ArrayList<>();
		for (Employee e: emplist)
		{
			if(e.getSkillset().contains(criteria))
			{
				filtered.add(e);
			}
		}
		return filtered;
	}
	
	public Map<Integer, Double> salaryMap(List<Employee> emplist)
	{
		Map<Integer, Double> salmap = new TreeMap();
		for(Employee e: emplist)
		{
			salmap.put(e.getEmpid(), e.getSalary());
		}
		return salmap;
	}
	public static void main(String[] args) 
	{
		EmployeeCollections ec = new EmployeeCollections();
		List<Employee> emplist = ec.initalizeEmployeData();
		
		ec.printlist(emplist);
		ec.searchEmployee(emplist, 56);
		
		System.out.println("-----------Employee skilled at java----------");
		List<Employee> byskill = ec.filterEmployees(emplist, "Java");
		ec.printlist(byskill);
		
		System.out.println("-----------Employee skilled at ----------");
		Map<Integer, Double> salmap = ec.salaryMap(emplist);
		for(java.util.Map.Entry<Integer, Double> entry : salmap.entrySet())
		{
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
		
		System.out.println("-----------sort emp by id ----------");
		Collections.sort(emplist);
		ec.printlist(emplist);
		
		System.out.println("-----------sort emp by name ----------");
		Collections.sort(emplist,new NameComparator());
		ec.printlist(emplist);
		
//		System.out.println("-----------sort emp by salary ----------");
//		Collections.sort(emplist,new SalaryComparator());
//		ec.printlist(emplist);
		
		System.out.println("-----------Search by employee name----------");
		int index = Collections.binarySearch(emplist,new Employee(0,"aaa",0,null), new NameComparator());
		System.out.println("Found index at: " +index);
		
		System.out.println("-----------Search by employee min salary----------");
		System.out.println(Collections.min(emplist,new SalaryComparator()));
		
		
		
				
		
		
		
		
	}
}
