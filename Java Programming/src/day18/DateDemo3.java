package day18;

import java.time.LocalDate;
import java.time.Period;

public class DateDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate today= LocalDate.now();
		System.out.println("Today's date is "+today );
		
		LocalDate bookingDate=LocalDate.of(2021, 3, 4);
		System.out.println("Booking date "+bookingDate );
		
		boolean validateDate=bookingDate.isAfter(today);
		if(validateDate)
			System.out.println("Correct date");
		else
			System.out.println("Booking date should be future date");
		System.out.println("===================================");
		
		Period p=Period.between(today, bookingDate);
		System.out.println(p.getYears()+" years "+p.getMonths()+" months "+p.getDays() +" days");
		
		LocalDate birthDay=LocalDate.of(1999, 5, 28);
		Period p1=Period.between(birthDay, today);
		System.out.println(p1.getYears()+" years "+p1.getMonths()+" months "+p1.getDays() +" days");
		
		

	}

}
