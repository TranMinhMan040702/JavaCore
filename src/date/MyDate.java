package date;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MyDate {
	public static void main(String[] args) throws ParseException {
//		LocalDate myDate = LocalDate.now();
//		System.out.println(myDate);
//		
//		LocalTime myTime = LocalTime.now();
//		System.out.println(myTime);
//		
//		LocalDateTime myDateTime = LocalDateTime.now();
//		System.out.println("Before formatting: " + myDateTime);
//		
//		DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
//		String formattedDate = myFormatter.format(myDateTime);
//		System.out.println("After formatting: " + formattedDate);
		
		 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	        String dateInString = "";

	        try {

	            Date date = (Date) formatter.parse(dateInString);
	            System.out.println(date);
	            System.out.println(formatter.format(date));

	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	}
}
