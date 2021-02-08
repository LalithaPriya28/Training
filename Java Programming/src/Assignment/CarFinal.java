package Assignment;

public class CarFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car(1965,"Bat Mobile");
		System.out.println("Before Acceleration,The speed is"+ " "+c.getSpeed());
		for(int i=0;i<10;i++) {
			c.accelerate();
			System.out.println(c.getSpeed());
		}
		System.out.println("Before applying Brake,The speed is"+ " "+c.getSpeed());
		for(int i=0;i<=5;i++) {
			c.brake();
			System.out.println(c.getSpeed());

		}
		System.out.println("After applying Brake,The speed is "+ " "+c.getSpeed());

	}

}
