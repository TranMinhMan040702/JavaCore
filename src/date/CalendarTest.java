package date;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
	public static void main(String[] args) {
		
		
	
		System.out.println("Start: " + getStartDate(1, 2023));
		System.out.println("End: " + getEndDate(1, 2024));
	}
	
	public static Date getStartDate(int month, int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
		calendar.set(Calendar.YEAR, year);
		return calendar.getTime();
	}
	
	public static Date getEndDate(int month, int year) {
		YearMonth yearMonthObject = YearMonth.of(year, month + 1);
		int daysInMonth = yearMonthObject.lengthOfMonth();
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DAY_OF_MONTH, daysInMonth);
		calendar.set(Calendar.YEAR, year);
		return calendar.getTime();
	}
}
