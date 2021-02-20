package day15FileHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintWriter pw=new PrintWriter("info.txt");
		pw.write("hi");//takes specific character
		pw.print(100);//takes object
		
		pw.flush();
		pw.close();
		
	}

}

