package day9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,result=0;
		
		try {
			Scanner s=new Scanner(System.in);
			a=s.nextInt();
			b=s.nextInt();
			result=a/b;
			
		}
		catch(InputMismatchException i) {
			System.out.println("Please give only numbers");
		}
		
		catch(ArithmeticException e) {
			System.out.println("Do not give 0 in denominator");
			e.printStackTrace();
		}
		System.out.println("Result is" +result);
	}

}
