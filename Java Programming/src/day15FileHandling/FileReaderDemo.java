package day15FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("hello.txt");
		//System.out.println((char)fr.read());
		//System.out.println((char)fr.read());
		//System.out.println((char)fr.read());
		//System.out.println((char)fr.read());
		
		int r=fr.read();
		while(r!=-1) {
			System.out.println((char)r);
			r=fr.read();
		}
	}

}
