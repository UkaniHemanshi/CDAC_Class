package day_3;

public class EmployeePortal 
{
	public static void main(String[] args) {
		PayrollApp payroll = new PayrollApp();
		
		// normal method 
		Salaried_employee se = new Salaried_employee(334,"ram",20000);
		payroll.displaygross(se);
		payroll.displayNet(se);
		
		// by creating array 
		Employee[] emp = new Employee[2];
		emp[0] = new Salaried_employee(345,"sita",34000);  //up casting
		emp[1] = new Salaried_employee(234,"lakhan",23000);
		
		System.out.println("\nGross salary and Net salary by array:\n");
		for(Employee i: emp)
		{
			System.out.println(i);
			
			payroll.displaygross(i);
			Salaried_employee ss = (Salaried_employee)i;  //down casting
			payroll.displayNet(ss);	
			System.out.println(" ");
		}
		
//		payroll.displaygross(emp[0]);
//		Salaried_employee ss = (Salaried_employee)emp[0];  //down casting
//		payroll.displayNet(ss);	
//		
		
		System.out.println("\nDisplay allowance:\n");
		for(Employee e: emp)
		{
		
			payroll.displaygross(e);
			if (e instanceof Manager)  //type checking operator
				((Manager)e).displayallowance();
			System.out.println(" ");
		}
	}
}
