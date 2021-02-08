package day5;
 class Employee
 {
	 int id;
	 String name;
	 double salary;
	 int experience;
	 void displayEmployeeDetails()
	 {
		 System.out.println("id"+" " +id);
		 System.out.println("Name"+" " +name);
		 System.out.println("salary"+" " +salary);
		 System.out.println("experience" +" " +experience);
		 }
		 String checkForLoanOption()
	 {
		 if(salary>75000.0)
			 return "you can apply for loan";
		 return "you can not apply for loan";
	 }
 
 }

public class EmployeeAppDemo {

	public static void main(String[] args) {
		Employee ravi=new Employee();
		ravi.id=1;
		ravi.name="Ravi kumar";
		ravi.salary=45000.0;
		ravi.experience=7;
		
		ravi.displayEmployeeDetails();
		
		String message=ravi.checkForLoanOption();
		System.out.println("info:"+" " +message);

	}

}
