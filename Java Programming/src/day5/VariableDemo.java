package day5;

public class VariableDemo {
	int a=10; //global variable
	
	void function() {
		int x=2;//local variable
		System.out.println("value of x "+" "+x);
		System.out.println("value of a "+" "+a);
	}
	void function1() {
		int y=3;//local variable
		System.out.println("value of y "+" "+y);
		System.out.println("value of a "+" "+a);
		//System.out.println("value of x "+" "+x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableDemo vd=new VariableDemo();
		vd.function();
		vd.function1();
	}

}
