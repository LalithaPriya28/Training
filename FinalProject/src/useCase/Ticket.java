package useCase;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Optional;
import java.util.Random;
import java.util.stream.IntStream; 



class Ticket   {

	private String pnr;
	private LocalDate travelDate;
	private Train train;
	private Passenger passenger;
	private String generateTicket;
	HashMap<Passenger, Double> hashMap;
	

	public Ticket(LocalDate travelDate, Train train) {
		super();
		this.travelDate = travelDate;
		this.train = train;
	}



	



	public String generatePNR() {
		
		Random rand = new Random();
		int counter = rand.nextInt(999);

		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append(train.getSource().charAt(0));
		stringBuilder.append(train.getDestination().charAt(0));
		stringBuilder.append("_");
		stringBuilder.append(travelDate);
		stringBuilder.append("_");
		stringBuilder.append(counter);
		pnr=stringBuilder.toString();

		return pnr;
	}





	public double calcPassengerFare(Passenger passenger) 
	{

		if(passenger.getAge()<12) 
			return train.getTicketPrice()*0.5;

		else if(passenger.getAge()>60 ) 
			return train.getTicketPrice()*0.6;

		else if(passenger.getGender()=='f' || passenger.getGender()=='F') 
			return train.getTicketPrice()*0.25;
		return train.getTicketPrice();

	}	


	void addPassenger(Passenger passenger)
	{
		hashMap=new HashMap<Passenger, Double>();
		hashMap.put(new Passenger(passenger.getName(), passenger.getAge(),passenger.getGender()),calcPassengerFare(passenger));
	}
	


	public Double calculateTotalTicketPrice() {
		Double totalTicketPrice=0.0d;
		for (Double value : hashMap.values()) {
			totalTicketPrice += value;
			
		}
		return totalTicketPrice;
	}

	public String generateTicket() {
		
		StringBuilder sb=new StringBuilder();
		sb.append("PNR :	").append("\t");
		sb.append(pnr);
		sb.append(System.getProperty("line.separator"));

		sb.append("Train no: ").append("\t");
		sb.append(train.getTrainNumber());
		sb.append(System.getProperty("line.separator"));

		sb.append("Train Name:").append("\t");
		sb.append(train.getTrainName());
		sb.append(System.getProperty("line.separator"));

		sb.append("From: 	").append("\t");
		sb.append(train.getSource());
		sb.append(System.getProperty("line.separator"));

		sb.append("To: 	").append("\t");
		sb.append(train.getDestination());
		sb.append(System.getProperty("line.separator"));

		sb.append("Travel Date:");
		sb.append(travelDate);
		sb.append(System.getProperty("line.separator"));
		sb.append(System.getProperty("line.separator"));

		sb.append("Passengers: ");
		sb.append(System.getProperty("line.separator"));
		sb.append("Name ").append("\t");
		sb.append("Age ").append("\t");
		sb.append("Gender ").append("\t");
		sb.append("Fare ");
		sb.append(System.getProperty("line.separator"));
		sb.append(passenger.getName());
		//sb.append(passenger.getAge()).append("\t");
		//sb.append(passenger.getGender()).append("\t");
		sb.append(train.getTicketPrice());
		sb.append(System.getProperty("line.separator"));
		sb.append("Total Price: ");
		sb.append(this.calculateTotalTicketPrice());
		generateTicket=sb.toString();
		return generateTicket;
		}
	
	public void writeTicket() {
		String fileName =pnr;

			try {
			FileWriter fw=new FileWriter(fileName);
			BufferedWriter bw =new BufferedWriter(fw);

			bw.write(generateTicket);

			bw.flush();
			bw.close();
		}
		catch(Exception e) {
			System.out.println(" ");
		}
	}
}


	
	
		
	
	
	
	
	
	
		
	
	
	

			

