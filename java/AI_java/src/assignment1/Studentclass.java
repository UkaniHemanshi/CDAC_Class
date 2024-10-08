package assignment1;

public class Studentclass 
{
	private String Name ;
	private static int rollnocounter = 0;
    int roll_no;

	public Studentclass(String name)
	{
		this.Name = name;
		rollnocounter ++;
		this.roll_no = rollnocounter;	
	}
	
	public void displayStudentCount()
	{
		
		System.out.println("Name of Student: "+ Name + "\nHis | Her roll number is: "+ roll_no +"\n");
	}
	
	public static void main(String[] args) 
	{
		Studentclass st1 = new Studentclass("hemanshi");
		Studentclass st2 = new Studentclass("ukani");
		Studentclass st3 = new Studentclass("krishna");
		st1.displayStudentCount();
		st2.displayStudentCount();
		st3.displayStudentCount();
	}
}
