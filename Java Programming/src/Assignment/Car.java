package Assignment;

public class Car {
	int yearModel;
	String make;
	int speed;
	public Car(int yearModel, String make) {
		super();
		this.yearModel = yearModel;
		this.make = make;
		this.speed=0;


	}
	public int getYearModel() {
		return yearModel;
	}

	public String getMake() {
		return make;
	}

	public int getSpeed() {
		return speed;
	}
	void accelerate() {
		speed+=5;
		
	}
	void brake() {
		speed-=5;
		if(speed<0) {
			speed=0;
		}
	}












}
