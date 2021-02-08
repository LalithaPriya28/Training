package day6;

class Parent1
{
	int a1=10;
	int c=20;
	
}
class Child1 extends Parent1
	{
	int b=20;
	void add() {
		int res=a1+b;
		System.out.println(res);
		
	}
	void subtraction() {
		int res1=b-b;
		System.out.println(res1);
		
	}
	void multiplication() {
		int c=15;
		int res2=c*super.c;
		System.out.println(res2);
	}
	
}
public class SingleInheritence {

	public static void main(String[] args) {
	Child1 c1=new Child1();
	c1.add();
	c1.subtraction();
	c1.multiplication();

	}

}
