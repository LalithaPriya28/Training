package day15FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("abc.txt",true);//true is for append
		fw.write("\n");
		fw.write("Hello \n");
		fw.write(98);//it takes only characters,if int is given it takes its ascii value 
		
		fw.flush();//writing is possible only with help of flush
		//flush() method flushes the stream. If the stream has saved any characters from the various write() methods
		fw.close();
		
		
		System.out.println("Data Written");
		
	}

}
