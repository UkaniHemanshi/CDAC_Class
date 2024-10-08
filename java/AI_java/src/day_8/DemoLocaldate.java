package day_8;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DemoLocaldate 
{
	public static void dateformat(int date,int month, int year)
	{
		System.out.printf("%d/%d/%d",date,month,year);
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		LocalDate today = LocalDate.now();
		System.out.println(today);

		LocalDate diwali = LocalDate.of(2024,10,29);
		System.out.println(diwali);
		
		Period timetodiwali = today.until(diwali);
		System.out.println(timetodiwali);
		System.out.println("Time Left for my birthday= " +timetodiwali.getYears() + " Year(s)" + +timetodiwali.getMonths() + " Month(s)"+ timetodiwali.getDays() + " Day(s)");
		
		long daystodiwali = today.until(diwali, ChronoUnit.DAYS);
		System.out.println(daystodiwali + " days");
		System.out.println();
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getMonthValue());
		System.out.println(today.getMonth());
		System.out.println(today.getYear());
		
		dateformat(today.getDayOfMonth(),today.getMonthValue(),today.getYear());
		
		LocalDate tomorrow = today.plusDays(1);
		System.out.println(tomorrow);
		
		LocalDate nextFriday = today.plus(7,ChronoUnit.DAYS);
		System.out.println(nextFriday);
		
		
		/// local time
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		LocalTime noon = LocalTime.NOON;
		long diff = now.until(noon,ChronoUnit.MINUTES);
		System.out.println(diff);
		
		Duration interval = Duration.between(now, noon);
		System.out.println(interval);
		
		now = now.plusHours(1);
		now = now.plus(10,ChronoUnit.MINUTES);
		System.out.println(now);
		
		LocalDateTime dt = now.atDate(LocalDate.of(2024, 10, 10));
	}

}
