package day_4;

public class Printer {
	public void printData(Printable p)
	{
		p.print();
		p.foo();
	}
	
	public static void main(String[] args) {
		Printer p = new Printer();
		Book b = new Book("The power",200);
		p.printData(b);
		
		Salaried_employee se = new Salaried_employee(234,"ram",30000);
		p.printData(se);
	}
}
