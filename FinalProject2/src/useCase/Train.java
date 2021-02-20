package useCase;

class Train  {
	private int trainNumber;
	private String trainName;
	private String source;
	private String destination;
	private double ticketPrice;


	public Train(int trainNumber, String trainName, String source, String destination, double ticketPrice) {
		super();
		this.trainNumber = trainNumber;
		this.trainName = trainName;
		this.source = source;
		this.destination = destination;
		this.ticketPrice = ticketPrice;
	}





	/**
	 * @return the trainNumber
	 */
	public int getTrainNumber() {
		return trainNumber;
	}





	/**
	 * @param trainNumber the trainNumber to set
	 */
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}





	/**
	 * @return the trainName
	 */
	public String getTrainName() {
		return trainName;
	}





	/**
	 * @param trainName the trainName to set
	 */
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}





	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}





	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}





	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}





	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}





	/**
	 * @return the ticketPrice
	 */
	public double getTicketPrice() {
		return ticketPrice;
	}





	/**
	 * @param ticketPrice the ticketPrice to set
	 */
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}





	@Override
	public String toString() {
		return "Train [trainNumber=" + trainNumber + ", trainName=" + trainName + ", source=" + source
				+ ", destination=" + destination + ", ticketPrice=" + ticketPrice + "]";
	}
}

