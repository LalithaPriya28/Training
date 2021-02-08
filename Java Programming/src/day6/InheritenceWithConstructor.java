package day6;

class Parent2{
	int id=1;
	String name="Lalitha";
	Parent2(int id,String name)
	{
		System.out.println("id:" + " " + id +" " + "Name-"
				+ "" + name);
		System.out.println("parent constuctor");
	}
	
}
class Child2 extends Parent2
{
		Child2(int id,String name){
			super(id,name);
			System.out.println("Child constructor");
			
		}
}
public class InheritenceWithConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 ch =new Child2(12, "Priya");
	}

}
