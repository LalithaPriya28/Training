package day15FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader f=new FileReader("C:\\Users\\Lenovo\\Documents\\NamingConventions.txt");
		BufferedReader b=new BufferedReader(f);
		String read= b.readLine();
		while(read!=null) {
			System.out.println(read);
			read=b.readLine();
		}
	}

}
