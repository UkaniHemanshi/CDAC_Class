package day_10;

public class Student 
{
	private int rollno;
	private String name;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	private void printMethod()
	{
		System.out.println("This is a private method ");
	}
	public static void staticMethod()
	{
		System.out.println("This is a static method ");
	}
	
	@CreateBy(priority = 1, CreateBy = "aaaaa")
	public void displayData()
	{
		System.out.println("Roll No "+rollno+" , Name"+name);
	}
	
	public void methodwithparams(int rollno)
	{
		this.rollno = rollno;
		System.out.println("Roll no set to: "+rollno);
	}
}
