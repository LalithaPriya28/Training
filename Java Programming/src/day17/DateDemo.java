package day17;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
		
		LocalDate today=LocalDate.now();
		
		System.out.println("Today's date is "+today);
		System.out.println("Year "+today.getYear());
		System.out.println("Month "+today.getMonthValue());
		System.out.println("Day "+today.getDayOfMonth());
		System.out.println("Today is "+today.getDayOfWeek());
		System.out.println(today.minusMonths(2));
		System.out.println(today.plusDays(5));
		
		LocalDate birthdate=LocalDate.of(2000, 11, 17);
		System.out.println(birthdate);
		

	}

}
