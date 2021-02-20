package day12Collection;
import java.util.*;

public class GenericCollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> o3= new ArrayList<Integer>();
		o3.add(5);
		ArrayList<String> o4= new ArrayList<String>();
		o4.add("Lalitha");
		ArrayList<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(1, "abc"));
		emp.add(new Employee(2, "abcd"));
		
		

	}
}
	
	class Employee{
		int id;
		String name;
		public Employee(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		
	}


