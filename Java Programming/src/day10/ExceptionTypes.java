package day10;

import java.io.FileNotFoundException;

public class ExceptionTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//throw new ArithmeticException("Exception occurs");
	try {
		throw new FileNotFoundException("Exception occurs");
		
	}
		
		catch(FileNotFoundException e) {
			System.out.println("File is not found");
		}
	}

}
