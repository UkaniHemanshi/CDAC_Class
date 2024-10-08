package class_assignment4;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class calculateAgeByDate 
{
	public static void main(String[] args) 
	{
		LocalDate BD = LocalDate.of(2002,10,29);
		LocalDate currentD = LocalDate.now();
		
		Period age = BD.until(currentD);
		System.out.println("My Age of now: "+ age.getYears()+" Year(s) "+ age.getMonths() +" Month(s) " + age.getDays()+" Day(s) ");
		
		LocalDate proDay = LocalDate.of(2024,9,12);
		System.out.println("\nProgrammer Day: "+proDay.getDayOfWeek());
		
		System.out.println("\nAll the months that started on a sundays in year 2024:");
		for(int Month = 1; Month<=12; Month++)
		{
			LocalDate firstday = LocalDate.of(2024,Month,1);
			if(firstday.getDayOfWeek() == DayOfWeek.SUNDAY)
			{
				System.out.println(firstday.getMonth());
			}
		}
		
		System.out.println("How long is the flight take when leave from Mumbai to New York:");
		LocalDateTime bTime = LocalDateTime.of(2024,10,6,2,5);
		ZonedDateTime bzTime = bTime.atZone(ZoneId.of("America/New_York"));
		
		LocalDateTime dTime = LocalDateTime.of(2024,10,7,4,40);
		ZonedDateTime dzTime = dTime.atZone(ZoneId.of("America/New_York"));
		
		Duration duration = Duration.between(bzTime, dzTime);
		
		// Output the result
        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
        
        System.out.printf("Total trip duration: %d hours and %d minutes%n", hours, minutes);
		
		
		
		
	}
	
	
}
