package test;

class Employee {

	String firstName;
	String lastName;


	public Employee(String firstName, String lastName) //parameterized constructor
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}

public class Problem2 {

	public static void main(String[] args) {


		Employee emp1= new Employee("Lalitha","Priya");
		Employee emp2= new Employee("Sindhu","Priya");
		Employee emp3= new Employee("Sachin","Tendulkar");

		System.out.println(emp1.toString());
		System.out.println(emp2);
		System.out.println(emp3);




		

	}

}
