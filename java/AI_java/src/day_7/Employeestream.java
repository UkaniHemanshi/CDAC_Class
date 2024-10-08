package day_7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Employeestream 
{
	public List<Employee> initalizeEmployeData()
	{
		List<Employee> emplist = new ArrayList<>();
		Set<String> skills1 = new TreeSet<>();
		skills1.add("Java");
		skills1.add("C++");
		
		emplist.add(new Employee(56,"aaa",23000,skills1,"IT"));
		
		Set<String> skills2 = new TreeSet<>();
		skills2.add("Java");
		skills2.add("Python");
		
		emplist.add(new Employee(56,"bbb",22000,skills2,"IT"));
		
		Set<String> skills3 = new TreeSet<>();
		skills3.add("ML");
		skills3.add("NLP");
		
		emplist.add(new Employee(90,"ccc",78000,skills3,"Admin"));
		
		Set<String> skills4 = new TreeSet<>();
		skills4.add("Python");
		skills4.add("DL");
		
		emplist.add(new Employee(90,"ccc",25000,skills4,"Admin"));
		return emplist;
	} 
	
	public static void main(String[] args) 
	{
		Employeestream ec = new Employeestream();
		List<Employee> emplist = ec.initalizeEmployeData();
		Stream<Employee> stream = emplist.stream();
		
		System.out.println("\n********Sorting by name*******\n");
		Comparator<Employee> byname = Comparator.comparing(Employee::getName);
		stream.sorted(byname).forEach(System.out::println);
		
		System.out.println("\n********Sorting by name for dept*******\n");
		stream = emplist.stream();
		Comparator<Employee> bydept = Comparator.comparing(Employee::getDepartmart).thenComparing(byname);
		stream.sorted(bydept).forEach(System.out::println);
		
		System.out.println("\n********Sorting by salary range *******\n");
		stream = emplist.stream();
		Predicate<Employee> salrange = (emp) -> {
			if(emp.getSalary() >= 23000 && emp.getSalary() < 75000)
				return (boolean) true;
			else
				return (boolean) false;};
				
	    stream.filter(salrange).forEach((v) -> System.out.println(v));
	    
	    System.out.println("\n********filter by skill*******\n");
	    stream = emplist.stream();
	    stream.filter(emp -> emp.getSkillset().contains("Java")).forEach(System.out::println);
	    
	    System.out.println("\n********Group by department*******\n");
	    stream = emplist.stream();
	    Map<String,List<Employee>> empsbydept = stream.collect(Collectors.groupingBy(Employee::getDepartmart));
	    empsbydept.forEach((k,v) -> System.out.println(k +" == "+v));
	    
	    System.out.println("\n********1,*******\n");
	    stream = emplist.stream();
	    stream.map((emp) -> new Department(emp.getEmpid(),emp.getDepartmart()));
	    
	    System.out.println("\n********2,*******\n");
	    stream = emplist.stream();
	    double totalval = stream.mapToDouble(Employee::getSalary).reduce(0, (e1,e2) -> e1+e2);
	    System.out.println(totalval);
	    
	}

}
