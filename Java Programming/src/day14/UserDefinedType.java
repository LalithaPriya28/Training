package day14;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public int compareTo(Employee emp) {
		if(id==emp.id)
			return 1;
		else if(id>emp.id)
			return 0;
		return -1;
		
	}
	
	
	
	
	
	
}

public class UserDefinedType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(13,"lalitha",18250));
		emp.add(new Employee(2,"priya",20250));
		System.out.println(emp);
		
		for(Employee e: emp) {
			System.out.println(e.name+" "+e.salary+" "+e.id);
		}
		
		Collections.sort(emp);
		for(Employee e: emp) {
			System.out.println(e.name+" "+e.salary+" "+e.id);
		}
		
		

	}

}
