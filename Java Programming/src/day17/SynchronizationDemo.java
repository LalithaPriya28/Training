package day17;

class WaterBottle{
	void drinkWater(int time) {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+ "is drinking "+ i);
		}
		
	}
}

class Water extends Thread{
	WaterBottle wb=new WaterBottle();
	public void run() {
		wb.drinkWater(5);
	}
	
	
}
public class SynchronizationDemo {

	public static void main(String[] args) {
		
		Water water=new Water();
		
		Thread lalitha=new Thread(water);
		Thread priya=new Thread(water);
		
		lalitha.setName("lalitha");
		priya.setName("priya");

	}

}
