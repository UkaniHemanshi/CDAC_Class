package assignment1;

public class Getter_setter
{
	private int day;
	private String month;
	private int year;
	public void setdate(int d, String m, int y)
	{
		this.day = d;
		this.month = m;
		this.year = y;
	}
	public void getdate()
	{
		System.out.println("Date: "+ day + "/"+ month + "/"+ year);
	}
	
	public static void main(String[] args) {
		
		Getter_setter gs = new Getter_setter();
		
		// for set date by setter
		gs.setdate(29, "Aug", 2002);
		
		// for get date by getter
		gs.getdate();
	}
}
