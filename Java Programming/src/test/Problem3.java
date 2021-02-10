package test;

class Employee1 {

	String firstName;
	String lastName;


	public Employee1(String firstName, String lastName) {
		super();

		this.firstName = firstName;
		this.lastName = lastName;

	}

	public void validation() throws Exception{
		if(firstName==null && lastName==null) {
			throw new NullPointerException("Please,Give atleast 3 characters");
		}

		else if(firstName.length()<3 && lastName.length()<3) {
			throw new Exception("Entry Missing!");
		}
		else {
			System.out.println("First Name: "+firstName);
			System.out.println("Last Name: "+lastName);
		}
	}



}

public class Problem3  {

	public static void main(String[] args) throws Exception  {


		Employee1 e= new Employee1("Lalitha","Priya");

		e.validation();

		Employee1 e1= new Employee1(null,null);
		e1.validation();


	}
}
