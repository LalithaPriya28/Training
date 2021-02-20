package day15FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//BufferedWriter bw =new BufferedWriter(new FileWriter("hi.txt"));
		FileWriter fw=new FileWriter("abc2.txt",true);
		BufferedWriter bw =new BufferedWriter(fw);
		
		bw.write("hello");
		bw.newLine();
		bw.write("welcome");
		bw.newLine();
		
		bw.flush();
		bw.close();
		
		
		
	}

}
