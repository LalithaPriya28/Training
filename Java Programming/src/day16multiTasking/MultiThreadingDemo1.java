package day16multiTasking;
class Lalitha extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Lalitha "+i);
		}
	}
	
}
class Priya extends Thread{
	public void run() {
		for(int i=20;i<=30;i++) {
			if(i>25) {
				try {
					sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Priya "+i);
		}
	}
	
}
class Sindhu extends Thread{
	public void run() {
		for(int i=40;i<=50;i++) {
			if(i==47) {
				stop();
			}
			System.out.println("Sindhu "+i);
		}
	}
	
}
public class MultiThreadingDemo1 {

	public static void main(String[] args) //parent thread for all threads
	{
		// TODO Auto-generated method stub
		Lalitha l=new Lalitha(); //Lalitha is thread type
		Sindhu s=new Sindhu();
		Priya p=new Priya();
		l.start();
		p.start();
		s.start();
		
		

	}

}
