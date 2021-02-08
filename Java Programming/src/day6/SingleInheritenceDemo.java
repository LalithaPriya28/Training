package day6;

class parent
{
	void display1() {
		System.out.println("This is a Parent");
	}
	
}
class child extends parent{
	void display2() {
		System.out.println("This is child");
	}
	
}
public class SingleInheritenceDemo {

	public static void main(String[] args) {
	parent p=new parent();
	p.display1();
	child c=new child();
	c.display1();
	c.display2();

	}

}
