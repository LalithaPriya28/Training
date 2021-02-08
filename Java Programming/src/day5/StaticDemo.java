package day5;

public class StaticDemo {
	int a=10;
	static int b=20;
	
	void disp1()
	{
		System.out.println("This is not a static method");
	}
	static void disp2()
	{
		System.out.println("This is a static method");
	}

	public static void main(String[] args) {
		System.out.println(StaticDemo.b);
		StaticDemo.disp2();
	}

}
