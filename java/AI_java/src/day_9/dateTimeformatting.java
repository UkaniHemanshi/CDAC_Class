package day_9;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateTimeformatting 
{
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(2024,12,12,16,23,40);
		System.out.println(dt);
		
		String date = dt.format(DateTimeFormatter.ofPattern("dd/MM/yy hh:mm:ss a"));
		System.out.println(date);
		
		date = dt.format(DateTimeFormatter.ofPattern("E-MM-yy hh:mm:ss"));
		System.out.println(date);
		
		String mydate = "2024/12/12 04:23:40";
		
		LocalDateTime mydt = LocalDateTime.parse(mydate,DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
		System.out.println(mydt);
	}
}
