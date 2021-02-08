package day6;

class Employee
{
	int id;
	String name;
	
	Employee(int id,String name){
		this.id=id;
		this.name=name;
		System.out.println("employee id is:"+" "+id);
		System.out.println("employee name is:"+" "+name);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}

public class ToStringDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Employee emp1= new Employee(1,"Lalitha");
		Employee emp2= new Employee(2,"Priya");
		//System.out.println(emp1.toString());
		//System.out.println(emp2.toString());
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
	}

}
