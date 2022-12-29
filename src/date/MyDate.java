package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MyDate {
	public static void main(String[] args) {
		LocalDate myDate = LocalDate.now();
		System.out.println(myDate);
		
		LocalTime myTime = LocalTime.now();
		System.out.println(myTime);
		
		LocalDateTime myDateTime = LocalDateTime.now();
		System.out.println("Before formatting: " + myDateTime);
		
		DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
		String formattedDate = myFormatter.format(myDateTime);
		System.out.println("After formatting: " + formattedDate);
	}
}
