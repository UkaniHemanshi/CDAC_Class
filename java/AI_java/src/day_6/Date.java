package day_6;

public class Date
{
	private int day;
	private String month;
	private int year;
	

	public int getDay() {
		return day;
	}

	public String getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
	
	public Date(int d, String m, int y) {
		// TODO Auto-generated constructor stub
		this.day = d;
		this.month = m;
		this.year = y;
	}

	public void setDate(int d,String m,int y) 
	{
		day = d;
		month = m;
		year = y;
	}
	
	public String displaydate() 
	{
		return "Date :"+day+"/"+month+"/"+year;
	}
	
	public String toString()
	{
		return day+"/"+month+"/"+year;
		
	}

}
