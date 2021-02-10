package test;

class Animal{
	public void shout() {
		System.out.println("SHOUTTTT...");
	}
}
class Dog extends Animal{
	@Override
	public void shout() {
		System.out.println("BARKKK...");
	}
	
}
class Horse extends Animal{
	@Override
	public void shout() {
		System.out.println("HORSE SHOUT...");
	}
}
class Cat extends Animal{
	@Override
	public void shout() {
		System.out.println("MEOW...");
	}
}

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal horse=new Horse();
		horse.shout();
		Animal cat=new Cat();
		cat.shout();
		Animal dog=new Dog();
		dog.shout();
		
		

	}

}
