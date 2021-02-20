package day18;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter booking date in the following pattern yyyy/MM/dd");
		String bookingDate=scan.next();
		
		DateTimeFormatter pattern=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		LocalDate localDate=LocalDate.parse(bookingDate, pattern);
		System.out.println("Booking date "+localDate);

	}

}
