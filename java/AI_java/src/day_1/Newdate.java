package day_1;

public class Newdate 
{
	private int day;
	private String month;
	private int year;

	
	public void setday(int day) {
		if(day<0)
		{
			System.out.println("Invalid input");
		}
		else
		{
			this.day = day;
		}
	}
	
	public int getday()
	{
		return day;
	}
	
	public void setmonth(String month) {
			this.month = month;
	}
	
	public String getmonth()
	{
		return month;
	}
	
	public void setyear(int year) {
		if(year<0)
		{
			System.out.println("Invalid input");
		}
		else
		{
			this.year = year;
		}
	}
	public int getyear()
	{
		return year;
	}
	public String toString()
	{
		return day+"/"+month+"/"+year;
		
	}

	
	
	public static void main(String[] args)
	{
		Newdate nd = new Newdate();
		nd.setday(29);
		nd.setmonth("Aug");
		nd.setyear(2002);
		
		System.out.println(nd);
		
	}

}
