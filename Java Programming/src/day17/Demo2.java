package day17;


class Lalitha extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
}
class Priya extends Thread{
	public void run() {
		for(int i=20;i<=30;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
}
class Sindhu extends Thread{
	public void run() {
		for(int i=40;i<=50;i++) {
			
			System.out.println(Thread.currentThread().getName()+" "+i);
			//System.out.println("Priority "+Thread.currentThread().getPriority() );
		}
	}
	
}
public class Demo2 {

	public static void main(String[] args) //parent thread for all threads
		{
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()); //refering to main thread
		Lalitha l=new Lalitha(); //Lalitha is thread type
		Sindhu s=new Sindhu();//Sindhu is thread type
		Priya p=new Priya();//Priya is thread type
		
		l.setName("Lalitha");
		s.setName("Sindhu");
		p.setName("Priya");
		
		l.setPriority(8);
		p.setPriority(2);
		s.setPriority(10);//l and p can start in between,but s finishes first followed by l and then p in the last.
		
		l.start();
		p.start();
		s.start();
		
		

	}

}
