package day7;

class Parent1{
	void fun1() {
		System.out.println("This is parent fun1");
	}
	void fun2() {
		System.out.println("This is parent fun2");
	}
}
	
	class Child1 extends Parent1
	{
		void fun1() {
			System.out.println("This is child fun1");
			
		}
		void fun3() {
			System.out.println("This is child fun3");
		}
		
		
	}


public class UpcastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 p1=new Child1();
		p1.fun1();
		//p1.fun3();
		
	}

}
