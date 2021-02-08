package day8;

abstract class Bank
{
	
	abstract void rateOfInterest();
	abstract void minBalance();
	
	void display() {
		System.out.println("Every 2nd Saturday off");
	}
}

class Sbi extends Bank{
	
	@Override
	void rateOfInterest() {
		System.out.println("The roi is 4%");
	}
	@Override
	void minBalance() {
		System.out.println("The Minimum Balance is 2000/-");
		
	}
	

}

	class Axis extends Bank{
		
		@Override
		void rateOfInterest() {
			System.out.println("The roi is 6%");
		}
		@Override
		void minBalance() {
			System.out.println("The Minimum Balance is 4000/-");
			
		}
		void display1() {
			System.out.println("Every 2nd and 4th Saturdays are off");
		}
	
	}



public class AbstractDemo {

	public static void main(String[] args) {
		Bank b= new Axis();
		b.display();
		b.rateOfInterest();
		b.minBalance();
		


	}

}
