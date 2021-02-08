package day6;
class Rbi{
	int amount;
	float roi;
	void MinBalance() {
		System.out.println("5000");
		}
	void RateOfInterest()
	{
		System.out.println("5%");
	}
	
	
}
class Icici extends Rbi{
	void MinBalance() {
		System.out.println("2000");
	}
	void RateOfInterest()
	{
		System.out.println("2%");
	}
	
}
class Citi extends Rbi{
	void MinBalance() {
		System.out.println("4000");
	}
	void RateOfInterest()
	{
		System.out.println("4%");
	}
}
public class OverRidingDemo {

	public static void main(String[] args) {
		
		Rbi rb=new Icici();
		rb.MinBalance();
		rb.RateOfInterest();
		Rbi rb1=new Citi();
		rb1.MinBalance();
		rb1.RateOfInterest();

	}

}
