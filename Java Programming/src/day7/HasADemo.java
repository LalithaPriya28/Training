package day7;
class Employee{
	int id;
	String name;
	Address ad;
	public Employee(int id, String name, Address ad) {
		//super();
		this.id = id;
		this.name = name;
		this.ad = ad;
	}
	void displayEmplyeeInfo()
	{
		System.out.println("Id"+" "+id);
		System.out.println("Name"+" "+name);
		System.out.println("Door No "+" "+ad.doorNo);
		System.out.println("Street name"+" "+ad.StreetName);
		System.out.println("City"+" "+ad.city);
	}
	
}
class Address{
	int doorNo;
	String StreetName;
	String city;
	public Address(int doorNo, String streetName, String city) {
		super();
		this.doorNo = doorNo;
		this.StreetName = streetName;
		this.city = city;
	}
	
}
public class HasADemo {

	public static void main(String[] args) {
		
		Address addr=new Address(108,"HMT","Hyderabad");
		Employee emp=new Employee(1,"Lalitha",addr);
		emp.displayEmplyeeInfo();
		
	}

}
