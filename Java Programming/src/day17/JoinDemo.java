package day17;


class Lalitha1 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
}
class Priya1 extends Thread{
	public void run() {
		for(int i=20;i<=30;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
}
class Sindhu1 extends Thread{
	public void run() {
		for(int i=40;i<=50;i++) {
			
			System.out.println(Thread.currentThread().getName()+" "+i);
			//System.out.println("Priority "+Thread.currentThread().getPriority() );
		}
	}
	
}

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		Lalitha1 l1=new Lalitha1(); //Lalitha is thread type
		Sindhu1 s1=new Sindhu1();//Sindhu is thread type
		Priya1 p1=new Priya1();//Priya is thread type
		
		l1.setName("Lalitha");
		s1.setName("Sindhu");
		p1.setName("Priya");
		
		l1.setPriority(8);
		p1.setPriority(2);
		s1.setPriority(10);//l and p can start in between,but s finishes first followed by l and then p in the last.
		s1.join();//on providing join,only after bringing this thread to the dead state all other threads will run
		
		
		l1.start();
		p1.start();
		s1.start();
		
		

	}

}
