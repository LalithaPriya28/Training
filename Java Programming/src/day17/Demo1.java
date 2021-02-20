package day17;

class A extends Thread{
	public void run() {
		System.out.println("This is extending thread class");
	}
	
}

class B implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is implementing runnable interface");
		
	}
	
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A o =new A();
		o.start();
		
		B b=new B();
		//b.start() doesn't work as the interface doesnt have start
		Thread t1=new Thread(b);
		t1.start();

	}

}
