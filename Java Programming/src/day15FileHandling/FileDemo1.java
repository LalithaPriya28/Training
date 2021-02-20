package day15FileHandling;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\Lenovo\\Documents\\abc.txt");
		if(f.exists()) //this exists throws exception,so handle it
		{
			System.out.println("File is Present");
		}
		else {
			System.out.println("File is not present");
		}
		f.createNewFile();//creates new file only if the specified file name is not present else re-writes
		System.out.println(f.exists());
		
		
		File f1=new File("C:\\Users\\Lenovo\\Documents\\apprentice");
		f1.mkdir();//creates a new folder
		System.out.println("Before delete "+f1.exists());
		f1.delete();
		System.out.println("After delete "+f1.exists());
		
		
		File f3=new File("hello.txt");//creates in java dir
		f3.createNewFile();
		System.out.println(f3.exists());
		
	}

}
