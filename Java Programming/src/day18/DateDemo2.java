package day18;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String date="2021/02/04";//default date format
		LocalDate today=LocalDate.now();
		
		DateTimeFormatter pattern1=DateTimeFormatter.ofPattern("yyyy/MMM/dd");
		DateTimeFormatter pattern2=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		System.out.println("Default format "+today);
		
		System.out.println("my format "+today.format(pattern2));
		System.out.println("my format "+today.format(pattern1));
		
		System.out.println("====================================================");
		
			LocalDate ld=LocalDate.parse(date,pattern2);
			System.out.println(ld);
	}

}
