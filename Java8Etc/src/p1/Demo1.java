package p1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class Demo1 {
	
	public static void main(String[] args) {
		
		LocalDate todayDate = LocalDate.now();
		System.out.println(todayDate);
		
		LocalDate futureDate = LocalDate.of(2023, 12, 31);
		System.out.println(futureDate);
		
		LocalDate pastDate = LocalDate.of(2023, 1, 1);
		System.out.println(pastDate);
		
		
		
		long futureDaysCount = (ChronoUnit.DAYS.between(todayDate,futureDate));
		System.out.println(futureDaysCount);
		
		long pastDaysCount = (ChronoUnit.DAYS.between(pastDate,todayDate));
		System.out.println(pastDaysCount);
		
		
		
		LocalDate newDate = futureDate.plusDays(4);
		System.out.println(newDate);
		
	}
}
