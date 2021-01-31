package day2;
import java.util.*;

public class UserInputDemo {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter your age");
		int age=scan.nextInt();
		System.out.println("age is: " +age);
		
		/*System.out.println("Enter your Name");
		String name=scan.next();
		System.out.println("Name is: " +name);*/
		
		System.out.println("Enter your Salary");
		int salary=scan.nextInt();
		System.out.println("salary is: " +salary);
		
		if(age>40 && salary>35000)
			System.out.println("You can apply for loan");
		else
			System.out.println("You cannot apply for loan");
	}
}
