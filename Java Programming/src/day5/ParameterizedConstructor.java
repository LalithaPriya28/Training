package day5;

class Car{
	String model;
	String brand;
	int seatCapacity;
	String engineType;

	Car(String model,String brand,int seatCapacity,String engineType){
		this.model=model;
		this.brand=brand;
		this.seatCapacity=seatCapacity;
		this.engineType=engineType;
	}
	void display() {
		System.out.println("Car's Model is:" + model);
		System.out.println("Car's Brand is:" + brand);
		System.out.println("Car's Seating Capacity is:" + seatCapacity);
		System.out.println("Car's Engine type is:" + engineType);

	}
	void CheckingType() {
		if(seatCapacity<5) {
			System.out.println("This is a Car");
		}else {
			System.out.println("This is a Mini Bus");
		}
	}
}

class ParameterizedConstructor {

	public static void main(String[] args) {

		Car c=new Car("Diesel","i10",4,"CC");
		c.display();
		c.CheckingType();
	}

}
