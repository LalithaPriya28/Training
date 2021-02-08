package day5;

class Product
{
	int id;
	int price;
	String name;
	
	Product(){
		System.out.println("This is a constructor");
		id=2;
		price=56000;
	}
	void disp() {
		System.out.println("This is a method");
		System.out.println("id" +id);
		System.out.println("price" +price);
		System.out.println("Name" +name);
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product laptop= new Product();
		laptop.disp();
		System.out.println("price" +laptop.price);

	}

}
