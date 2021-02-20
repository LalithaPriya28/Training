package useCase;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TicketApplication {

	public static void main(String[] args) {
		
		try {

		TrainDAO trainDao=new TrainDAO();

		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the Train Number ");
		Train train=trainDao.findTrain(scan.nextInt());

		//if train is null
		if(train==null)
			System.out.println("Train not found");



		System.out.println("Enter Travel date(dd/MM/yyyy)");
		String bookingDate=scan.next();

		DateTimeFormatter pattern=DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate travelDate=LocalDate.parse(bookingDate, pattern);
		LocalDate today= LocalDate.now();

		boolean validateDate=travelDate.isAfter(today); //DATE VALIDATION
		if(validateDate)
			System.out.println("Trains are available on this date");
		else
			System.out.println("ALERT : Booking date should be a future date");
		
		Ticket ticket=new Ticket(travelDate, train);
		Passenger p=new Passenger();

		System.out.println("Enter the Number of Passengers " );
		int numberOfPassengers=scan.nextInt();
		for(int i=0;i<numberOfPassengers;i++) 
		{
			System.out.println("Enter your Name: ");
			String name=scan.next();

			System.out.println("Enter Age ");
			int age=scan.nextInt();

			System.out.println("Enter Gender(M/F) ");
			char gender=scan.next().charAt(0);
			if(gender!='m' && gender!='f' && gender!='M' && gender!='F') 
				System.out.println("ALERT: Specify your gender");
			
			System.out.println(ticket.calcPassengerFare(new Passenger(name,age,gender)));
			
			
			
			ticket.addPassenger(new Passenger(name,age,gender));
			
			
			
			

			
		}
		
	
		ticket.generatePNR();
		ticket.calculateTotalTicketPrice();
		ticket.generateTicket();
		
		ticket.writeTicket();
		}
		catch(Exception e) {
			System.out.println(e);
		}







	}
		
		
		
		
		
		
		
		

}		
		
	



